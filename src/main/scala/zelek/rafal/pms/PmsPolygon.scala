package zelek.rafal.pms

import scodec._


case class PmsPolygon(
  vertices: (PmsVertex, PmsVertex, PmsVertex),
  normals: (PmsVector, PmsVector, PmsVector),
  polyType: PmsPolyType
)

object PmsPolygon {
  private val vertexCodec: Codec[(PmsVertex, PmsVertex, PmsVertex)] = (
    PmsVertex.codec ::
      PmsVertex.codec ::
      PmsVertex.codec
    ).as[(PmsVertex, PmsVertex, PmsVertex)]

  private val vectorCodec: Codec[(PmsVector, PmsVector, PmsVector)] = (
    PmsVector.codec ::
      PmsVector.codec ::
      PmsVector.codec
    ).as[(PmsVector, PmsVector, PmsVector)]

  val codec: Codec[PmsPolygon] = (
    vertexCodec ::
      vectorCodec ::
      PmsPolyType.codec
    ).as[PmsPolygon]
}