package exercises.chapter2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FibonacciSpec extends AnyFlatSpec with Matchers {
  "function fib" should "give 0 as the 1st fibonacci" in {
    Fibonacci.fib(1) shouldEqual 0
  }

  "function fib" should "give 1 as the 2st fibonacci" in {
    Fibonacci.fib(2) shouldEqual 1
  }

  "function fib" should "give 5 as the 6th fibonacci" in {
    Fibonacci.fib(5) shouldEqual 5
  }

}
