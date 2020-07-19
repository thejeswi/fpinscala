package exercises.chapter2

object Curry {
  def c[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a,b)
}
