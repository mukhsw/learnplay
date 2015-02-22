import com.typesafe.sbt.packager.universal.UniversalKeys
import play._
import sbt._
import Keys._

object PlayScalaBuild extends Build with UniversalKeys {
  /**
   * Define the root project as a Play application.
   */

  lazy val root =
    project.in(file("."))
    .settings(commonSettings:_*)
    .enablePlugins(PlayScala)

  /**
   * The setting that will be applied to all sub projects
   */

  lazy val commonSettings = Seq(
    organization := "umm.mukh"
    version := "1.0-SNAPSHOT",
    name := "play-scala"
    scalaVersion := "2.11.4"
    )
}
