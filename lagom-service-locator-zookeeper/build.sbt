organization := "com.lightbend.lagom"

name := "lagom-service-locator-zookeeper"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

val lagomVersion = "1.2.0"

libraryDependencies ++= Seq(
  "com.lightbend.lagom" %% "lagom-javadsl-api"   % lagomVersion,
  "org.apache.curator"   % "curator-x-discovery" % "2.11.0",
  "org.apache.curator"   % "curator-test"        % "2.11.0" % Test,
  "org.scalatest"       %% "scalatest"           % "2.2.4" % Test
)