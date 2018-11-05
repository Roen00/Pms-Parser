package adt

import scodec._

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

case class PmsOptions(
  name: CharWithFiller,
  texture: CharWithFiller,
  backgroundColorTop: PmsColor,
  backgroundColorBottom: PmsColor,
)

object PmsOptions {
  private val nameFillerLength = 38.toByte
  private val textureFillerLength = 24.toByte
  val codec: Codec[PmsOptions] = (
    charWithFiller(nameFillerLength) ::
      charWithFiller(textureFillerLength) ::
      PmsColor.codec ::
      PmsColor.codec
    ).as[PmsOptions]
}
