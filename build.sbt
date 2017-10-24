name := "sourcegraph"

version := "0.1"

scalaVersion := "2.12.3"

// sbt 1.0.x
enablePlugins(Antlr4Plugin)

antlr4PackageName in Antlr4 := Some("com.sourcegraph.rmagen")
