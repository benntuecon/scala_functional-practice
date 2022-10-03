import scala.annotation.tailrec

object functionPractice extends App {
  def greetingForKid(name:String, age:Int) : String =
    "hi, my name is " + name +" and I'm " + age + " years old"

  println(greetingForKid("ben", 10))

  def fab(n:Int) : Int =
    if(n==1 || n == 2) 1 else fab(n-1) + fab(n-2)
  println(fab(6))

  def isPrime(n: Int) : Boolean = {
    @tailrec
    def isPrimeUntil(t: Int) : Boolean=
      if (t<=1) true else n % t != 0 && (isPrimeUntil(t-1))
    isPrimeUntil(n/2)
  }
  println(isPrime(100001))
  println(isPrime(2003))
  println(isPrime(99))


  def factorial(n: Int) : Int = {
    @tailrec
    def factorialrec(c: Int, cum: Int) : Int={
      if (c==1) return cum
      factorialrec(c-1, c*cum)
    }
    factorialrec(n,1)
  }

  println(factorial(1))
  println(factorial(5))
  println(factorial(10))
}
