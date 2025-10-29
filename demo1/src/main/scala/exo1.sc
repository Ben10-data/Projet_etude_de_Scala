// val nom : String = "Alla"
// val prenom = "yass"
// var age = 50
// age = 60 
// println(s"moi je suis ${nom} et ${prenom}, ${age}")

// def hello(nom :String) = {
//     s"bonjour ${nom}"
// }

class Person(val nom: String, val prenom : String,var statut : String, var age :Int){
    
    def moi() = {
        println(s"Je suis ${nom} ${prenom}")
     } 

    def monage()={
        println(s"j\'ai ${age}")
    }

    def changerdestatus(statut :String) = {
        println(s"Je chznge de statut ${statut}")
    }
}

object Person:
    val odc : String = "ODC"
    def Jsuis() = {
        println("Je suis de ODC")
    }

val p1 = Person("ben", "Tamou","www",25)
val p2 = Person("Awa", "fall","ffff", 22)


p1.moi()
p1.monage()
p1.changerdestatus("defght")

Person.Jsuis()