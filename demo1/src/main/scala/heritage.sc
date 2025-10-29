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
val cat1 = Cat("rex")
println(cat1.speak())


