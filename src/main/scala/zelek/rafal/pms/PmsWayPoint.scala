package zelek.rafal.pms

import scodec._
import scodec.codecs._

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
  connectionsSize: Int,
  connections: Vector[Int]
)

object PmsWayPoint {
  val codec: Codec[PmsWayPoint] = (
    logToStdOut("active" | byte) ::
      logToStdOut("filler1" | int24L) ::
      logToStdOut("id" | int32L) ::
      logToStdOut("x" | int32L) ::
      logToStdOut("y" | int32L) ::
      logToStdOut("left" | byte) ::
      logToStdOut("right" | byte) ::
      logToStdOut("up" | byte) ::
      logToStdOut("down" | byte) ::
      logToStdOut("jet" | byte) ::
      logToStdOut("path" | shortL(8)) ::
      logToStdOut("action" | shortL(8)) ::
      logToStdOut("c2" | shortL(8)) ::
      logToStdOut("c3" | shortL(8)) ::
      logToStdOut("filler3" | int24L) ::
      int32L ::
      vectorOfN(provide(20), int32L)
    ).as[PmsWayPoint]
}
