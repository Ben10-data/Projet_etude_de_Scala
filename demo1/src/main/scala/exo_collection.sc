// Exo1 : 
import scala.collection.mutable.Map

val a = Map("chien"-> "dog", "chat"->"cat")
a("oiseau") = "bird"

// print(a)

val b = List(1, 2, 3, 4, 5, 6)
val c = b.filter(_%2 == 0)
val resultat = c.map(_*10)

// println(resultat)


// Exo2 : 

def reduceListe() = { 
    val a = List(1, 2, 3, 4)
    val b = a.reduce(_+_)
    print(b)
}

// reduceListe()
