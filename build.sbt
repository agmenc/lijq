import SonatypeKeys._

name := "lijq"

organization := "com.github.agmenc"

version := "2.0.1"

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.3", "2.11.4")

libraryDependencies +=  "net.liftweb" %% "lift-webkit" % "2.6" % "compile"

// --------- Publishing -----------------------
sonatypeSettings

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

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
    <url>https://github.com/agmenc/lijq</url>
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
