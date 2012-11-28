libraryDependencies +=  "net.liftweb" %% "lift-webkit" % "2.5-M3" % "compile"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "test",
  "javax.servlet" % "servlet-api" % "2.5" % "test"
)
