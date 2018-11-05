package adt

import scodec._
import scodec.codecs._

/**
  * typedef struct tagPMS_OPTIONS {
  * UBYTE nameLen;
  * CHAR name[nameLen];
  * CHAR nameFiller[38-nameLen];
  * UBYTE texLen;
  * CHAR texture[texLen];
  * CHAR textureFiller[24 - texLen];
  * PMS_COLOR bgColorTop;
  * PMS_COLOR bgColorBottom;
  * LONG jetAmount;
  * UBYTE grenades;
  * UBYTE medikits;
  * PMS_WEATHERTYPE weather;
  * PMS_STEPSTYPE steps;
  * LONG randID;
  * } PMS_OPTIONS;
  */
//case class Name()
case class PmsOptions(name: CharWithFiller)

object PmsOptions {
  val codec: Codec[PmsOptions] = charWithFiller(38).as[PmsOptions]
}
