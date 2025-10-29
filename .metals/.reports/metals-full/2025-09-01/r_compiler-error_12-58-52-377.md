error id: 54F3C3A56CBB969EE58368ECB1A53B15
file://<WORKSPACE>/demo1/src/main/scala/.scala-build/scala_d5c0a6989e/src_generated/main/fichier.sc.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.



action parameters:
offset: 1175
uri: file://<WORKSPACE>/demo1/src/main/scala/.scala-build/scala_d5c0a6989e/src_generated/main/fichier.sc.scala
text:
```scala


final class fichier$_ {
def args = fichier_sc.args$
def scriptPath = """fichier.sc"""
/*<script>*/
def hello(name : String): String =
    return s"bonjour ${name}"


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

verification()


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
        else if (nombre <90 [[@@]] nombre >= 70 ){
             println(s" Vous avez la mention excellent, ${nombre}")
        }
        else if (nombre <70 or nombre >= 50 ){
            println(s" Vous avez la mention passable, ${nombre}")
        }
        else { 
            println("redouble les efforts")
        }

    }}
```


presentation compiler configuration:
Scala version: 3.7.2-bin-nonbootstrapped
Classpath:
<WORKSPACE>/demo1/src/main/scala/.scala-build/scala_d5c0a6989e/classes/main [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.2/scala3-library_3-3.7.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/demo1/src/main/scala/.scala-build/scala_d5c0a6989e/classes/main/META-INF/best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE>/demo1/src/main/scala -Ywith-best-effort-tasty




#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2655)
	dotty.tools.dotc.core.SymUtils.isLocalToBlock(SymUtils.scala:351)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:223)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:482)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner