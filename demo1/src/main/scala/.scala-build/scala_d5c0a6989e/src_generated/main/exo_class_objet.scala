

final class exo_class_objet$_ {
def args = exo_class_objet_sc.args$
def scriptPath = """exo_class_objet.sc"""
/*<script>*/
/// Exo1 : 

class Person(val nom : String, var age:Int){
    
    def info(): String = {
          s"${nom} a ${age} ans."
    }
}

val p1 = Person("Alice", 30)
val p2 = Person("Ben", 25)

// println(p1.info())
// println(p2.info())

/// Exo2 : 

object Config:
    val nom: String = "Moi c'est ben Tamou"
    def printApp() = 
        s"Application: ${nom}\n"

print(Config.printApp()) 


///--------Exo3: -------------------

class Livre(val titre: String, val auteur : String){
    def title():String = s"Ce livre se nomme ${titre}\n"

}

object Livre:
    def apply(titre: String, auteur: String):Livre = 
        new Livre(titre, auteur)
    
    def fromCsv(s :String) :Livre = {
        val seperation = s.split(",")
        Livre(seperation(0), seperation(1))
    }


val liv1 = Livre("Scala", "Martin Odersky")
val liv2 = Livre.fromCsv("Java,James Gosling")

print(liv1.title())


////// Exo3: 

class Compte (private  var solde : Double){

    def deposer (m:Double) : Unit = {
        solde += m 
    }

    def retirer(m: Double): Unit = {
        if (solde >=m && solde >0){
            solde -= m
        }
        else { 
            println("Cette operation ne peut aps etre executer")
        }
    }

    def afficher_solde() = {
        print(s" votre solde est de ${solde}")
    }
}

object Compte:
    
    def apply(soldeInitialle : Double) : Compte = new Compte(soldeInitialle)

    def zeroSolde(): Compte = Compte(0.0)

///////

val compte1 = Compte.zeroSolde()
compte1.afficher_solde()

val compte2 = Compte.apply(2000)
compte2.afficher_solde()
/*</script>*/ /*<generated>*//*</generated>*/
}

object exo_class_objet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exo_class_objet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exo_class_objet_sc.script as `exo_class_objet`

