package exercises.chapter2

object Uncurry extends App {
  def u[A,B,C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)
}
