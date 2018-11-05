import scodec.Codec
import scodec.codecs.{byte, provide, ubyte, vectorOfN}
import shapeless.{::, HNil}

package object adt {
  def charWithFiller(maxLength: Byte): Codec[CharWithFiller] = {
    byte(8).consume { nameLength =>
      val name = vectorOfN(provide(nameLength), byte)
      val nameFiller = vectorOfN(provide(38 - nameLength), byte)
      (name :: nameFiller).xmap(toChar, toByte).as[CharWithFiller]
    }(_.value.length.toByte)
  }

  private def toChar(vectors: Vector[Byte] :: Vector[Byte] :: HNil): Vector[Char] :: Vector[Char] :: HNil = vectors match {
    case a :: b :: HNil => a.map(_.toChar) :: a.map(_.toChar) :: HNil
  }

  private def toByte(vectors: Vector[Char] :: Vector[Char] :: HNil): Vector[Byte] :: Vector[Byte] :: HNil = vectors match {
    case a :: b :: HNil => a.map(_.toByte) :: a.map(_.toByte) :: HNil
  }
}
