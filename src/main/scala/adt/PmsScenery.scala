package adt

import scodec._
import scodec.codecs._

case class PmsScenery(name: CharWithFiller, timestamp: Int)

object PmsScenery{
  val codec: Codec[PmsScenery] = (
    CharWithFiller.codec(50) ::
    int32L
  ).as[PmsScenery]
}
