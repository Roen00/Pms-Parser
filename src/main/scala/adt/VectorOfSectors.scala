package adt

import scodec._
import scodec.codecs._
import shapeless.{::, HNil}


case class VectorOfSectors(division: Int, numberOfSectors: Int, sectors: Vector[PmsSector])

object VectorOfSectors {
  val codec: Codec[VectorOfSectors] = (int32L :: int32L).consume {
    case division :: numberOfSectors :: HNil =>
      val count = (2 * numberOfSectors + 1) * (2 * numberOfSectors + 1)
      println(count)
      (("division" | provide(division)) ::
        ("numberOfSectors" | provide(numberOfSectors)) ::
        ("sectors" | vectorOfN(provide(count), PmsSector.codec))
        ).as[VectorOfSectors]
  } { vectorOfSectors =>
    //TODO: probably numberOfSectors needs to be calculated based on sectors vector
    vectorOfSectors.division :: vectorOfSectors.numberOfSectors :: HNil
  }
}