package exercises.chapter2

object Fibonacci extends App {
  def fib(n: Int): Int = {
    def run(a:Int, b: Int, n: Int): Int =
      if (n == 0) b else run(b, a+b, n-1)

    n match {
      case 1 => 0
      case 2 => 1
      case n => run(0, 1, n-1)
    }
  }
}
