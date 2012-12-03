lijq
====

LIJQ (pronounced "like you") lets you write `JsExp`-style [Lift](http://liftweb.net/) expressions that compile in Scala, yet look like JQuery:

```scala
  $("#monkeys").addClass("hairy") &
  $.ajax("http://request.bananas.com", "{colour: 'yellow'}")
```

Add to your sbt project:
```scala
  libraryDependencies +=  "org.agmenc.github" %% "lijq" % "1.8.3" % "compile"
```
