package FP



object FPLowLevel extends App {
  val adder = new myFunc[String, String]:
    override def apply(element: String): String = element  + element

  //  val adderInt = new Function2[Int, Int, Int]:
  //    override def apply(v1: Int, v2: Int): Int = v1 + v2
  //  val adderInt : Function2[Int, Int, Int] = new Function2[Int, Int, Int]:
  //    override def apply(v1: Int, v2: Int): Int = v1 + v2
  val adderInt: ((Int, Int) => Int) = new Function2[Int, Int, Int]:
    override def apply(v1: Int, v2: Int): Int = v1 + v2

  println(adderInt(3,4))

  val superAdder : Function1[Int, Function1[Int,Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  println("return by super adder")
  println(superAdder(3)(4)) // curried functions


  // anonymous function

  val lambdaFunction: Int => Int = (x:Int) => x*2

  // MOAR style syntactic sugar
  val lambda: Int => Int = _ * 2
  val lambdaTwo: (Int, Int ) => Int = _ + _
  val lambdaSupperAdd = (a: Int) => (b: Int) => a + b

  println(lambda(3))
  println(lambdaTwo(3,4))
  println(lambdaSupperAdd(3)(4))


}


// function1
trait myFunc[a,b] {
  def apply(element:a) : b
}




