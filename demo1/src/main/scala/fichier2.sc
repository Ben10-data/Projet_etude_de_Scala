//import scala.compiletime.ops.double
val nom = "Ben"
val age = 25

val valeur1 : Int = 10 

val valeur2 : Double = valeur1.toDouble 

def bonjour(agent:String): Unit = {
    println(s" bonjour${nom} et j'ai ${age}, bienveue, c'est ${agent} ")
}

bonjour("Amina")

val agent1 = bonjour("Tamou")
print(agent1)

def add(x: Int, y: Double): String = { 
    return s"La somme est de ${x + y}"
}

val f = (x:Int) => x +2

var ben :Int = f(10)
print(s"salut ${nom} du ${ben}")

ben = 555

val ben1 = ben.toString
// print(s" c'est le new mood ${ben1}")

// print(valeur2)

val z : Int = 13

val y = z.toString

print(s"bonjour ${y}")

//println(add(5, 10.32))


nom.getclass()