package exercises.chapter2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IsSortedSpec extends AnyFlatSpec with Matchers {
  val intComp = (a: Int,b: Int) => a<b
  val strComp = (a: String, b: String)=> a.compareTo(b) < 0
  "function isSorted" should "return true for an empty array" in {
    IsSorted.run(Array(), intComp) shouldEqual true
  }
  "function isSorted" should "return true for a sorted int array" in {
    IsSorted.run(Array(1,2,3), intComp) shouldEqual true
  }
  "function isSorted" should "return true for a sorted string array" in {
    IsSorted.run(Array("aa", "bb"), strComp) shouldEqual true
  }
}
