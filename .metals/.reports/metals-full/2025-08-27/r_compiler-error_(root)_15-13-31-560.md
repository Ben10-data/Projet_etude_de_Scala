error id: 88D8779BBEA7FF7647BD3D40AE6BD4E1
file://<WORKSPACE>/projet1_scala/src/main/scala/fichier2.sc
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.



action parameters:
uri: file://<WORKSPACE>/projet1_scala/src/main/scala/fichier2.sc
text:
```scala
val nom = "Ben"
val age = 25

def 

println(s"Je m'appelle ${nom}")
```


presentation compiler configuration:
Scala version: 3.7.2-bin-nonbootstrapped
Classpath:
<WORKSPACE>/projet1_scala/.bloop/root/bloop-bsp-clients-classes/classes-Metals-taIAAPhmT4O4WpvAnrSbYQ== [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.11.0/semanticdb-javac-0.11.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.2/scala3-library_3-3.7.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <WORKSPACE>/projet1_scala/.bloop/root/bloop-bsp-clients-classes/classes-Metals-taIAAPhmT4O4WpvAnrSbYQ==/META-INF/best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE>/projet1_scala -Ywith-best-effort-tasty




#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.parsing.Scanners$Scanner.lookahead(Scanners.scala:1124)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause$$anonfun$1(Parsers.scala:3643)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosedWithCommas(Parsers.scala:623)
	dotty.tools.dotc.parsing.Parsers$Parser.inParensWithCommas(Parsers.scala:636)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause(Parsers.scala:3664)
	dotty.tools.dotc.parsing.Parsers$Parser.recur$6(Parsers.scala:3434)
	dotty.tools.dotc.parsing.Parsers$Parser.typeOrTermParamClauses(Parsers.scala:3449)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3983)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3876)
	dotty.tools.dotc.parsing.Parsers$Parser.topStatSeq(Parsers.scala:4629)
	dotty.tools.dotc.parsing.Parsers$Parser.topstats$1(Parsers.scala:4822)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit$$anonfun$1(Parsers.scala:4827)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:550)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit(Parsers.scala:4832)
	dotty.tools.dotc.parsing.Parsers$Parser.parse(Parsers.scala:206)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:32)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:510)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:51)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:368)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1324)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:361)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$2(Run.scala:408)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$adapted$1(Run.scala:408)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.Run.showProgress(Run.scala:470)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:408)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:420)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:420)
	dotty.tools.dotc.Run.compileSources(Run.scala:307)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:357)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:155)
```
#### Short summary: 

java.lang.AssertionError: assertion failed