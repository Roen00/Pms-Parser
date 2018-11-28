package adt

import scodec._
import scodec.codecs._

case class PmsObject(
  active: Byte,
  filler1: Byte,
  style: Int,
  width: Int,
  height: Int,
  x: Float,
  y: Float,
  rotation: Float,
  scaleX: Float,
  scaleY: Float,
  alpha: Short,
  filler2: Int,
  color: PmsColor,
  level: Short,
  filler3: Int
)

object PmsObject {
  val codec: Codec[PmsObject] = (
    ("active" | byte) ::
      ("filler1" | byte) ::
      ("style" | int16L) ::
      ("width" | int32L) ::
      ("height" | int32L) ::
      ("x" | floatL) ::
      ("y" | floatL) ::
      ("rotation" | floatL) ::
      ("scaleX" | floatL) ::
      ("scaleY" | floatL) ::
      ("alpha" | ushort8) ::
      ("filler2" | intL(24)) ::
      ("color" | PmsColor.codec) ::
      ("level" | ushortL(8)) ::
      ("filler3" | intL(24))
    ).as[PmsObject]
}
