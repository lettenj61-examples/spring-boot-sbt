enablePlugins(TomcatPlugin)

val bootV = "2.1.8.RELEASE"

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

webappWebInfClasses := true

libraryDependencies ++= Seq(
  // War deployment example. Exclude to not to include embedded tomcat
  "org.springframework.boot" % "spring-boot-starter-web" % bootV exclude("org.springframework.boot", "spring-boot-starter-tomcat"),

  // Anyway, the jar is needed for compile
  "org.springframework.boot" % "spring-boot-starter-tomcat" % bootV % "provided",

  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.9"
)

Compile / run / mainClass := Some("com.github.lettenj61.springboot.Start")
