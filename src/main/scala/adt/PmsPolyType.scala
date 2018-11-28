package adt

import scodec._
import scodec.codecs._
case class PmsPolyType(polyType: Short)

object PmsPolyType{
  val codec: Codec[PmsPolyType] = ushort8.as[PmsPolyType]
}
