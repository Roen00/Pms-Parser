package zelek.rafal.pms

import scodec.Codec
import scodec.codecs._
import shapeless.{::, HNil}

case class CharWithFiller(value: Vector[Char], filler: Vector[Char])

object CharWithFiller {
  def codec(maxLength: Byte): Codec[CharWithFiller] = {
    ushortL(8).consume { nameLength =>
      val name = vectorOfN(provide(nameLength), byte)
      val fillerLength = maxLength - nameLength
      val nameFiller = vectorOfN(provide(fillerLength), byte)
      (name :: nameFiller).xmap(toChar, toByte).as[CharWithFiller]
    }(_.value.length.toByte)
  }

  private def toChar(vectors: Vector[Byte] :: Vector[Byte] :: HNil): Vector[Char] :: Vector[Char] :: HNil = vectors match {
    case a :: b :: HNil => a.map(_.toChar) :: b.map(_.toChar) :: HNil
  }

  private def toByte(vectors: Vector[Char] :: Vector[Char] :: HNil): Vector[Byte] :: Vector[Byte] :: HNil = vectors match {
    case a :: b :: HNil => a.map(_.toByte) :: b.map(_.toByte) :: HNil
  }
}