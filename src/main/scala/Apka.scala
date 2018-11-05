

import scala.scalajs.js
import js.annotation._
import scala.annotation.meta.field

case class Dupa(@(JSExport @field) header: String)

@ScalaJSDefined
@JSExport("TutorialLib")
class Apka extends js.Object {
  def helloWorld(): Dupa = {
    println("Hello world!")
    Dupa("gowno")
  }
}
/*
lib = require('./target/scala-2.12/pms-parser-opt')
  o = new lib.TutorialLib()
  o.helloWorld()
 */