import sbt.Keys._
import sbt._

/**
 *
 * @author Robert Nad
 */
object Dependencies {
  val akkaVersion = "2.6.8"
  lazy val core: SettingsDefinition = {
    dependencyOverrides ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test
    )
  }
}
