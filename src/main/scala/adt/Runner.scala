package adt

import scodec.bits._
import scodec.codecs._
import org.kiama.output.PrettyPrinter._
object Runner extends App {
  val hexValue = hex"0b0000001a6374665f417368206279206368616b61706f6b6f206d616b6572160000da050f3d5ec8c891170c72697665726265642e626d7000000000a721a7210000010058b1c5ff140907ffbe0000000404000069420300d1000000608114c3ac2801c30000803f0000803f8d8b8bff60818fbf56"
  ///222
  val result = PmsFile.codec.decodeValue(hexValue.bits)
  println(pretty(any(result), w=120))
//  println(PmsFile.codec.encode(result.toOption.get).map(_.bytes))
}
