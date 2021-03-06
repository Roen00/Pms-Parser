package zelek.rafal.pms

import scodec._
import scodec.codecs._

/**
  * struct PMS_FILE {
  * PMS_HEADER header;
  * PMS_OPTIONS options;
  * LONG polygonCount;
  * PMS_POLYGON polygon[polygonCount];
  * LONG sectorDivision;
  * LONG numSectors;
  * //PMS_SECTOR sector[(numSectors*2)+1][(numSectors*2)+1]; // unlike VB/Delphi, can't define the lower bound; only the length. -25 to 25 is the same as 0 to 50, or length of 51 ((2*25)+1)
  * PMS_SECTOR sector[((numSectors*2)+1)*((numSectors*2)+1)]; // same as above, but as a single flat array. Use whatever you feel most comfortable with.
  * LONG propCount;
  * PMS_PROP prop[propCount];
  * LONG sceneryCount;
  * PMS_SCENERY scenery[sceneryCount];
  * LONG colliderCount;
  * PMS_COLLIDER collider[colliderCount];
  * LONG spawnpointCount;
  * PMS_SPAWNPOINT spawnpoint[spawnpointCount];
  * LONG waypointCount;
  * PMS_WAYPOINT waypoint[waypointCount];
  * };
  */
case class PmsFile(
  header: PmsHeader,
  options: PmsOptions,
  polygons: Vector[PmsPolygon],
  vectorOfSectors: VectorOfSectors,
  objects: Vector[PmsObject],
  sceneries: Vector[PmsScenery],
  colliders: Vector[PmsCollider],
  spawnPoints: Vector[PmsSpawnPoint],
  wayPoints: Vector[PmsWayPoint]
)

object PmsFile {
  val codec: Codec[PmsFile] = (
    logToStdOut(PmsHeader.codec) ::
      logToStdOut(PmsOptions.codec) ::
      vectorOfN(intL(32), PmsPolygon.codec) ::
      VectorOfSectors.codec ::
      vectorOfN(intL(32), PmsObject.codec) ::
      vectorOfN(intL(32), PmsScenery.codec) ::
      vectorOfN(intL(32), PmsCollider.codec) ::
      vectorOfN(intL(32), PmsSpawnPoint.codec) ::
      vectorOfN(intL(32), PmsWayPoint.codec)
    ).as[PmsFile]
}
