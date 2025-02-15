lazy val commonSettings = Seq(
  version := "1.0.0-beta55",
  scalaVersion := "2.13.0"
)

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8" % Test
val sprayJson = "io.spray" %% "spray-json" % "1.3.5"
val snakeYaml = "org.yaml" % "snakeyaml" % "1.25"
val scaffeine = "com.github.blemale" %% "scaffeine" % "3.1.0"
val directories = "io.github.soc" % "directories" % "11"

ideaPluginName in ThisBuild := "IntelliJ-Haskell"

lazy val intellijHaskell = (project in file(".")).
  enablePlugins(SbtIdeaPlugin).
  settings(commonSettings: _*).
  settings(
    name := "IntelliJ Haskell",
    javacOptions in Global ++= Seq("-source", "1.8", "-target", "1.8"),
    scalacOptions in Global ++= Seq("-target:jvm-1.8", "-deprecation", "-feature"),
    libraryDependencies += scalaTest,
    libraryDependencies += sprayJson,
    libraryDependencies += snakeYaml,
    libraryDependencies += scaffeine,
    libraryDependencies += directories,
    unmanagedSourceDirectories in Compile += baseDirectory.value / "gen"
  )

ideaBuild in ThisBuild := "192.6603.28"
