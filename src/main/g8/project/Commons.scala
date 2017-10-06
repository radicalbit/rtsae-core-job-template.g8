import sbt._
import Keys._
import Dependencies._

object Commons {

  val scalaVer = "$scala_version$"

  val settings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := scalaVer,
    organization := "$organization$",
    resolvers ++= Seq(
      Opts.resolver.mavenLocalFile,
      "Radicalbit Releases" at "https://tools.radicalbit.io/artifactory/libs-release-local/",
      "Radicalbit Snapshots" at "https://tools.radicalbit.io/artifactory/libs-snapshot-local/"
    ),
    libraryDependencies ++= flink.core ++ Operators.libs,
    parallelExecution in Test := false
  )
}
