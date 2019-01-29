package zelek.rafal.pms

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

case class PmsOptions(
  name: CharWithFiller,
  texture: CharWithFiller,
  backgroundColorTop: PmsColor,
  backgroundColorBottom: PmsColor,
  jetAmount: Long,
  grenades: Short,
  medkits: Short,
  weather: Short,
  stepsType: Short,
  randomId: Long
)

object PmsOptions {
  private val nameFillerLength = 38.toByte
  private val textureFillerLength = 24.toByte
  val codec: Codec[PmsOptions] = (
    logToStdOut(CharWithFiller.codec(nameFillerLength)) ::
      logToStdOut(CharWithFiller.codec(textureFillerLength)) ::
      logToStdOut(PmsColor.codec) ::
      logToStdOut(PmsColor.codec) ::
      logToStdOut(longL(32)) ::
      logToStdOut(ushort(8)) ::
      logToStdOut(ushort(8)) ::
      logToStdOut(ushort(8)) ::
      logToStdOut(ushort(8)) ::
      logToStdOut(longL(32))
    ).as[PmsOptions]
}
