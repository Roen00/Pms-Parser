package zelek.rafal.pms

import scodec._
import scodec.codecs._

case class  PmsVertex(
  x: Float,
  y: Float,
  z: Float,
  rhw: Float,
  color: PmsColor,
  tu: Float,
  tv: Float
)

object PmsVertex {
  val codec: Codec[PmsVertex] = (
    floatL ::
      floatL ::
      floatL ::
      floatL ::
      PmsColor.codec ::
      floatL ::
      floatL
    ).as[PmsVertex]
}