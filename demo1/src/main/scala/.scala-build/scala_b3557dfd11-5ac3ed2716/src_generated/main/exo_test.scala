

final class exo_test$_ {
def args = exo_test_sc.args$
def scriptPath = """exo_test.sc"""
/*<script>*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object exo_test_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exo_test$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exo_test_sc.script as `exo_test`

