import play.sbt.PlayImport._

name := "HubbleClient"

version := "1.0-SNAPSHOT"

// The format of specifying dependencies is groupId, artifact, version
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "webjars-locator" % "0.6",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "requirejs" % "2.1.10",
  "com.google.code.gson" % "gson" % "2.3.1", 
  "org.webjars.bower" % "angular" % "1.4.3",
  "org.webjars.bower" % "angular-route" % "1.4.3",
  "org.webjars.bower" % "angular-ui-router" % "0.2.15",
  javaWs
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// requireJs += "app.js"

// requireJsShim += "app.js"

