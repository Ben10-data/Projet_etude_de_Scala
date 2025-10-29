

final class heritage$_ {
def args = heritage_sc.args$
def scriptPath = """heritage.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*//*</generated>*/
}

object heritage_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new heritage$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export heritage_sc.script as `heritage`

