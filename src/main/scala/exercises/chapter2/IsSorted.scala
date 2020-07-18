package exercises.chapter2

object IsSorted {
  def run[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(n: Int): Boolean =
      if (n >= as.length-1) true
      else if (ordered(as(n), as(n+1))) loop(n+1)
      else false
   loop(0)
  }
}