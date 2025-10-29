

final class fichier$_ {
def args = fichier_sc.args$
def scriptPath = """fichier.sc"""
/*<script>*/
def hello(name: String) = {
     s"bonjour ${name}"
}

val a = hello("ben")
println(a +" de type " + a.getClass())


// exo1 

def verification() = {
    val nomb = scala.io.StdIn.readLine("donner une valeur a votre choix")
    var nombre = nomb.toDouble

    if (nombre < 0) {
      println(s" le nombre ${nombre} est negatif")  
    }

    else if (nombre == 0){
        println(s" le nombre ${nombre} n'est ni positif ni negatif ")
    }
    else { 
        println(s"le nombre ${nombre} est juste positif")
    }
}

//verification()

//////-------------------------------Exo3 --------------------/////////

//// Exercice 3 --- Noter sur 100 

// Notes et mentions

    // Lire une note sur 100 et afficher la mention :

                // = 90 → "Excellent"

                // 70–89 → "Bien"

                // 50–69 → "Passable"

                // < 50 → "Échec"
// exo3 : 
def noter() = {

        val num = scala.io.StdIn.readLine("Donner votre note ")
        val nombre = num.toDouble

        if (nombre >= 90){
            println(s" Vous avez la mention excellent, ${nombre}")
        }
        else if (nombre <90 && nombre >= 70 ){
             println(s" Vous avez la mention excellent, ${nombre}")
        }
        else if (nombre <70 && nombre >= 50 ){
            println(s" Vous avez la mention passable, ${nombre}")
        }
        else { 
            println("redouble les efforts")
        }

    }

// noter()


///////------------------------- Exo 4 ------------------------------------///
// Exo4: 

def calcul(nombre_succ : Int) = {
    var n = nombre_succ
    var somme = 0

    while (n > 0){
        somme += n 
        n = n -1 
    }

    println(s"La somme est de ${somme}")
}

//calcul(3)
//// ---------------- Exo4 Nombre paires --------------------------{{{{}}}}

def lister_pairs(nombre: Int)= {
   for (i <- 1 to nombre if i %2 == 0) yield i 
}




// print(lister_pairs(20))

///// ------------- Compteur de lettre ----------------------/////

def compter_lettre() = {
    val mot : String = scala.io.StdIn.readLine("Ecris un mot ou une phrase: ")
    for ( el <- mot){
        println(s"${el} ----->>>>${mot.indexOf(el)}")
    }
}

compter_lettre()




/*</script>*/ /*<generated>*//*</generated>*/
}

object fichier_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new fichier$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export fichier_sc.script as `fichier`

