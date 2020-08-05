import sbt.Keys._

/**
 *
 * @author Robert Nad
 */
object Settings {
  lazy val common = Seq(
    organization := "ork.waaagh.arrgard",
    scalaVersion := "2.12.10"
  )
}
