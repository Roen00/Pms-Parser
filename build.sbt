name := "pms-parser"

version := "0.1"

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

scalaJSUseMainModuleInitializer := false
scalaJSModuleKind := ModuleKind.CommonJSModule