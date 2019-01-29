package zelek.rafal.pms

import scodec._
import scodec.codecs._

case class PmsColor(blue: Short, green: Short, red: Short, alpha: Short)

object PmsColor {
  val codec: Codec[PmsColor] = (
    logToStdOut(ushortL(8)) ::
      logToStdOut(ushortL(8)) ::
      logToStdOut(ushortL(8)) ::
      logToStdOut(ushortL(8))
    ).as[PmsColor]
}
