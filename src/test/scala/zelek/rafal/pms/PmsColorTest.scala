package zelek.rafal.pms

import org.scalatest.{FunSuite, Matchers}
import scodec.Attempt
import scodec.Attempt.Successful
import scodec.bits._

class PmsColorTest extends FunSuite with Matchers{
  test("encoded -> decoded -> encoded") {
    val vector = hex"0x58b1c5ff".bits
    val result: Attempt[BitVector] = for {
      decoded <- PmsColor.codec.decodeValue(vector)
      encoded <- PmsColor.codec.encode(decoded)
    } yield encoded
    result shouldEqual Successful(vector)
  }
}
