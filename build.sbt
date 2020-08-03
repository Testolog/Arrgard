ThisBuild / scalaVersion := "2.13.3"

val akkaVersion = "2.6.8"

lazy val arrgard = project
  .in(file("."))
  .settings(
    name := "Arrgard",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed"           % akkaVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed"   % akkaVersion   % Test
    )
  )