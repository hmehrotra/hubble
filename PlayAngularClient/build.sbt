name := "HubbleClient"

version := "1.0-SNAPSHOT"

// The format of specifying dependencies is groupId, artifact, version
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1-2",
  "org.webjars" % "angularjs" % "1.2.13",
  "com.google.code.gson" % "gson" % "2.3.1"
)     

play.Project.playScalaSettings

requireJs += "app.js"

requireJsShim += "app.js"

