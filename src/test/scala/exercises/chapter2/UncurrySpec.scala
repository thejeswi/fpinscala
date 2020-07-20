package exercises.chapter2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UncurrySpec  extends AnyFlatSpec with Matchers {
  "function Uncurry.u" should "return an uncurried function" in {
    def plus = (a: Int) => (b: Int) => a+b
    val adder = Uncurry.u(plus)
    adder(2,3) shouldEqual 5
  }
}
