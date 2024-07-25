file://<WORKSPACE>/p5_q3.scala
### java.lang.AssertionError: assertion failed: denotation class Unit invalid in run 3. ValidFor: Period(4.1-2)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file://<WORKSPACE>/p5_q3.scala
text:
```scala
import scala.io.StdIn.readInt;

object P5_Q3 {
    def fib(n : Int): Int = {
        if (n <= 1){
            n
        }else{
            fib(n-1) + fib(n-2)
        }
    }

    def fibSequence(n : Int): Unit = {
        if (n<0){
            println("entered invlied number!")
        }else{
         for (i<- 0 until n) {
            print(fib(i).toString + "," )
         }
         println()
        }
    }

    def main(args: Array[String]): Unit = {
        print("Enter natural number: ");
        var n = readInt();
        fibSequence(n)
    }
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:723)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:748)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:805)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:876)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:124)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:118)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:109)
	dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:542)
	dotty.tools.dotc.core.TypeApplications$.typeParams$extension(TypeApplications.scala:183)
	dotty.tools.dotc.core.TypeApplications$.typeParamSymbols$extension(TypeApplications.scala:230)
	dotty.tools.dotc.typer.Typer.adaptType$1(Typer.scala:4298)
	dotty.tools.dotc.typer.Typer.adapt1(Typer.scala:4406)
	dotty.tools.dotc.typer.Typer.adapt(Typer.scala:3701)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3298)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typedType(Typer.scala:3416)
	dotty.tools.dotc.typer.Typer.typedDefDef(Typer.scala:2597)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3119)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3220)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3298)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:2796)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3125)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3129)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3220)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3298)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3324)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3370)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2947)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3171)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3221)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3298)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3413)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:47)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:477)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:53)
	dotty.tools.dotc.typer.TyperPhase.$anonfun$4(TyperPhase.scala:99)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:684)
	scala.collection.immutable.List$.from(List.scala:681)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:898)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:100)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:337)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:350)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:360)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:360)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.PcCollector.<init>(PcCollector.scala:42)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:109)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Unit invalid in run 3. ValidFor: Period(4.1-2)