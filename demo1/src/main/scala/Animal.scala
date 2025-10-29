open class Animal (val name : String){
   def speak(): String = {
    s"${name} fait du buit"
   }
}

class Dog(name : String) extends Animal (name){
    override def speak(): String = s"${name} aboie"
}


class Cat(name: String) extends Animal(name){
    override def speak(): String = s"${name} miaouw"


}
@main def testAnimals() = {
  val a = Animal("keda lawakh")  
  val d = Dog("Rex")     
  val c = Cat("Minou")      
  println(a.speak())
  println(d.speak())
  println(c.speak())

}