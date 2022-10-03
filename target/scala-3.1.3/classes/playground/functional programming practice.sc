// tail recursion replacing for / while loop

import scala.annotation.tailrec
def factorial(n:Int): Int =
  if (n <=1) 1
  else {
    n * factorial(n - 1)
  }

def tail_factorial(n:Int) : Int =
  @tailrec
  def tail_helper(n: Int, accumulator:Int): Int =
    // base case
    if ( n <= 1) accumulator
    else{
      tail_helper(n-1, accumulator*n)
    }
  tail_helper(n,1)


val x = tail_factorial(10)
println(x)

def concat_s(c: String, times: Int) : String =
  @tailrec
  def concate_string(s : String, n:Int, accumulated_string: String): String =
    if (n == 0) accumulated_string
    else{
      concate_string(s, n-1, accumulated_string+s)
    }

  concate_string(c, times, "")

println(concat_s("ben", 10))

def isPrime(n: Int): Boolean=
  @tailrec
  def tail_helper(divider: Int, isStillPrime: Boolean):Boolean =
    if (!isStillPrime) isStillPrime
    else if (divider==1) true
    else tail_helper(divider -1, n % divider !=0 && isStillPrime)

  tail_helper(n/2, true)


println(isPrime(1001))


// 1 ,1 ,2 ,3
def fibonacci(n: Int): Int =
  @tailrec
  def tail_helper(now: Int, prev: Int, counter:Int): Int =
    if ( counter > n) now
    else tail_helper(now+prev, now, counter+1)


  if(n<= 2) 1
  else {
    tail_helper(1,1,3)
  }

println(fibonacci(3))










