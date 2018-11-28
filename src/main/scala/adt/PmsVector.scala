package adt

import scodec._
import scodec.codecs._

case class PmsVector(x: Float, y: Float, z: Float)

object PmsVector {
  val codec: Codec[PmsVector] = (
    floatL ::
      floatL ::
      floatL
    ).as[PmsVector]
}
