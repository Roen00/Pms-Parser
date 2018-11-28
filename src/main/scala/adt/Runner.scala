package adt

import java.nio.file.{Files, Paths}

import scodec.bits._
import scodec.codecs._
import org.kiama.output.PrettyPrinter._
object Runner extends App {
  val byteArray = Files.readAllBytes(Paths.get("/home/rafalzel/projects/pms-parser/src/main/scala/adt/ctf_Ash.pms"))
  val hexValue = ByteVector(byteArray)

  val result = PmsFile.codec.decodeValue(hexValue.bits)
  println(pretty(any(result), w=120))
//  println(PmsFile.codec.encode(result.toOption.get).map(_.bytes))
}
