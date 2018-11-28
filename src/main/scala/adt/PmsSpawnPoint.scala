package adt

import scodec._
import scodec.codecs._

case class PmsSpawnPoint(
  active: Byte,
  filler: Int,
  x: Int,
  y: Int,
  team: Long
)

object PmsSpawnPoint {
  val codec: Codec[PmsSpawnPoint] = (
    byte ::
      int24L ::
      int32L ::
      int32L ::
      ulongL(32)
    ).as[PmsSpawnPoint]
}
