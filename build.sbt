libraryDependencies +=  "net.liftweb" %% "lift-webkit" % "2.5-M3" % "compile"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "test",
  "javax.servlet" % "servlet-api" % "2.5" % "test",
  "org.specs2" %% "specs2" % "1.11" % "test" withSources(),
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test" withSources(),
  "junit" % "junit" % "4.8.1" % "test" withSources(),
  "org.mockito" % "mockito-core" % "1.9.0-rc1" % "test" withSources()
)
