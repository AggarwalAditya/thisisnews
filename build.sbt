import versions._

name := "thisisnews"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaActor,
  "com.typesafe.akka" %% "akka-http" % akkaHttp,
  "com.typesafe.akka" %% "akka-stream" % akkaStream
)

