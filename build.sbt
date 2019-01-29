name := "pms-parser"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.7"

enablePlugins(ScalaJSPlugin)

val circeVersion = "0.10.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "org.scodec" %% "scodec-bits" % "1.1.6"
libraryDependencies += "org.scodec" %% "scodec-core" % "1.10.3"
libraryDependencies += "com.googlecode.kiama" %% "kiama" % "1.8.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"


scalaJSUseMainModuleInitializer := false
scalaJSModuleKind := ModuleKind.CommonJSModule