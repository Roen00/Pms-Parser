package adt

import scodec._
import scodec.codecs._
import shapeless._

case class PmsWayPoint(
  active: Byte,
  filler1: Int,
  id: Int,
  x: Int,
  y: Int,
  left: Byte,
  right: Byte,
  up: Byte,
  down: Byte,
  jet: Byte,
  path: Short,
  action: Short,
  c2: Short,
  c3: Short,
  filler2: Int,
  connections: Vector[Long],
  filler3: Vector[Long]
)

object PmsWayPoint {
  val codec: Codec[PmsWayPoint] = (
    byte ::
      int24L ::
      int32L ::
      int32L ::
      int32L ::
      byte ::
      byte ::
      byte ::
      byte ::
      byte ::
      shortL(8) ::
      shortL(8) ::
      shortL(8) ::
      shortL(8) ::
      int24L ::
      vectorOfN(int32L, longL(32)).consume { connections =>
        provide(connections) :: vectorOfN(provide(20 - connections.size), longL(32))
      } { case connections :: filler :: HNil =>
        Vector.fill(20 - connections.size)(0)
      }
    ).as[PmsWayPoint]
}
