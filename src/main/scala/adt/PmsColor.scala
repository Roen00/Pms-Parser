package adt

import scodec._
import scodec.codecs._

case class PmsColor(blue: Byte, green: Byte, red: Byte, alpha: Byte)

object PmsColor {
  val codec: Codec[PmsColor] = (byte(8) :: byte(8) :: byte(8) :: byte(8)).as[PmsColor]
}
