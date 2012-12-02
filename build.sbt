name := "lijq"

organization := "com.github.agmenc"

version := "1.8.3"

crossScalaVersions := Seq("2.9.1", "2.9.2", "2.10.0-RC3")

libraryDependencies +=  "net.liftweb" %% "lift-webkit" % "2.5-M3" % "compile"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "test",
  "javax.servlet" % "servlet-api" % "2.5" % "test",
  "org.specs2" %% "specs2" % "1.11" % "test" withSources(),
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test" withSources(),
  "junit" % "junit" % "4.8.1" % "test" withSources(),
  "org.mockito" % "mockito-core" % "1.9.0-rc1" % "test" withSources()
)

// --------- Publishing -----------------------
publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/agmenc/lijq</url>
  <licenses>
    <license>
      <name>GPL version 3 or any later version</name>
      <url>http://www.gnu.org/licenses/gpl.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/agmenc/Pettswood</url>
    <connection>scm:git:git@github.com:agmenc/lijq.git</connection>
  </scm>
  <developers>
    <developer>
      <id>agmenc</id>
      <name>Chris Agmen-Smith</name>
      <url>https://github.com/agmenc/lijq</url>
    </developer>
  </developers>
)