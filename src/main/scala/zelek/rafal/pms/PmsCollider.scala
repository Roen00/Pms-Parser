package zelek.rafal.pms

import scodec._
import scodec.codecs._

case class PmsCollider(
  active: Byte,
  filler: Int,
  x: Float,
  y: Float,
  radius: Float
)

object PmsCollider {
  val codec: Codec[PmsCollider] = (
    byte ::
      int(24) ::
      floatL ::
      floatL ::
      floatL
    ).as[PmsCollider]
}
