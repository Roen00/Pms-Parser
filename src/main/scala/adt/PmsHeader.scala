package adt

import scodec._
import scodec.codecs._

/**
  * typedef struct tagPMS_HEADER {
  * LONG version;
  * } PMS_HEADER;
  */
case class PmsHeader(version: Long)

object PmsHeader {
  val codec: Codec[PmsHeader] = longL(32).as[PmsHeader]
}
