package OOP_prac

object OOBasics extends App {

  val animal = new Animal
  println(animal)
  println(animal.noise)
  animal.train("")
  println(animal.noise)


  val trainer = new Trainer("ben", animal)
  trainer.train()
  println(animal.noise)

  val other_animal = new Animal("dog", "wooo")

  println(trainer.cotrain(other_animal))
  println(trainer cotrain other_animal)

  trainer()


  val son = Animal(animal,other_animal)
  println(son.the_name)

}

class Animal (name: String, sound:String){
  var noise = sound
  val the_name = name


  def this() = this("cat", "mow")

  def this(name: String ) = this(name,"roar")


  def train(kind: String): Unit =
    this.noise = kind
}


class Trainer(name: String, animal: Animal){
  def train(): Unit =
    this.animal.train(this.name)
    println(f"the animal start to making ${this.animal.noise}")

  def cotrain(animal: Animal): String= f"${this.animal.the_name} is co trained with ${animal.the_name}"

  // syntatic sugar
  def apply() = this.train()

}


// singleton "static" type of class only instance
object Animal {
  val name : String = "static animal"
  def noise: Unit = println("noise, static")

  def apply(a: Animal, b: Animal): Animal = new Animal(a.the_name+b.the_name)
}





