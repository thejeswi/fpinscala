package exercises.chapter2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CurrySpec  extends AnyFlatSpec with Matchers {
  "function Curry.c" should "return a curried function" in {
    def plus(a:Int, b:Int): Int = a + b
    val add3 = Curry.c(plus)(3)
    add3(1) shouldEqual 4
  }
}
