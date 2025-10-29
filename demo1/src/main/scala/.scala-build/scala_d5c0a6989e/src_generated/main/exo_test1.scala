

final class exo_test1$_ {
def args = exo_test1_sc.args$
def scriptPath = """exo_test1.sc"""
/*<script>*/
/// Exo 1 ----- Fonction lambda------//

    ///Créer une fonction anonyme qui multiplie un nombre par 3 et 
        //l’assigner à une variable triple.

val triple = (x : Int) => x * 3 

println(triple(5))

//// Exo2 

def factoriel(n : Int) : Int = {
    if (n == 0) 1 
    else {
        n *  factoriel(n -1)
    }

}
println(factoriel(2))

var a : Int = 12 
val b = 12

a += b

print(a)

/*</script>*/ /*<generated>*//*</generated>*/
}

object exo_test1_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exo_test1$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exo_test1_sc.script as `exo_test1`

