file://<WORKSPACE>/Main.scala
### java.lang.AssertionError: assertion failed: denotation object Predef invalid in run 3. ValidFor: Period(4.1-2)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 9
uri: file://<WORKSPACE>/Main.scala
text:
```scala
object Ma@@

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
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:722)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:748)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:805)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:876)
	dotty.tools.dotc.core.Types$NamedType.fromDesignator$1(Types.scala:2505)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2520)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2475)
	dotty.tools.dotc.core.Types$TermRef.underlying(Types.scala:2953)
	dotty.tools.dotc.core.Types$TypeProxy.superType(Types.scala:2132)
	dotty.tools.dotc.core.Types$Type.decls(Types.scala:677)
	dotty.tools.pc.IndexedContext$.accessibleSymbols$1(IndexedContext.scala:167)
	dotty.tools.pc.IndexedContext$.allAccessibleSymbols$1(IndexedContext.scala:184)
	dotty.tools.pc.IndexedContext$.fromImportInfo$1(IndexedContext.scala:209)
	dotty.tools.pc.IndexedContext$.dotty$tools$pc$IndexedContext$$$extractNames(IndexedContext.scala:226)
	dotty.tools.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:117)
	dotty.tools.pc.IndexedContext$.apply(IndexedContext.scala:105)
	dotty.tools.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:116)
	dotty.tools.pc.IndexedContext$.apply(IndexedContext.scala:105)
	dotty.tools.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:116)
	dotty.tools.pc.IndexedContext$.apply(IndexedContext.scala:105)
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:48)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:363)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation object Predef invalid in run 3. ValidFor: Period(4.1-2)