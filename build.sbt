
ThisBuild / scalaVersion := "2.12.10"

Compile / compile / scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  // "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Ywarn-unused"
)

version := "0.1.0-SNAPSHOT"

organization := "com.github.lettenj61"

name := "spring-boot-sbt-example"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.1.8.RELEASE",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.9"
)

Compile / run / mainClass := Some("com.github.lettenj61.springboot.BootApplication")