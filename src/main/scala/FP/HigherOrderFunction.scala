package FP

import scala.annotation.tailrec

object HigherOrderFunction extends App{

  val overlyComplicatedFunction : (Int, (( String, String) =>(String, String) => Int)) => (Int => (Int, Int) => String) = null

  // repeat a functions n times

  @tailrec
  def nTimes(f:(Int => Int), n:Int, input: Int) : Int =
    if (n == 0) input
    else {
      nTimes(f, n-1, f(input))
    }

  def double : (Int => Int) = _ * 2

  println(nTimes(double, 10, 1))

  // chained style to return a function that actually 10x the given function

  def nTimeProducer(f: Int => Int, n: Int): (Int => Int)=
    if (n == 0) (x:Int) => x
    else (x: Int) => nTimeProducer(f, n-1)(f(x))

  val y = nTimeProducer(double,10)
  println(y(1))









}
