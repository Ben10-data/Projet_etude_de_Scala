

final class exo_collection$_ {
def args = exo_collection_sc.args$
def scriptPath = """exo_collection.sc"""
/*<script>*/
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

reduceListe()
/*</script>*/ /*<generated>*//*</generated>*/
}

object exo_collection_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exo_collection$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exo_collection_sc.script as `exo_collection`

