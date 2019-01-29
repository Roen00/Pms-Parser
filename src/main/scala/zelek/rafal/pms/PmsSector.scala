package zelek.rafal.pms

import scodec._
import scodec.codecs._

case class PmsSector(polygons: Vector[Int])

object PmsSector {
  val codec: Codec[PmsSector] = uint16L.consume { polygonsCount =>
    vectorOfN(provide(polygonsCount), uint16L)
  }(_.size).as[PmsSector]
}
