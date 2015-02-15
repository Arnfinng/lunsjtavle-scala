name := "lunsjtavle-scala"

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "mvnrepository" at "http://mvnrepository.com/artifact/"

libraryDependencies ++= List(
  "org.eclipse.jetty" % "jetty-webapp" % "9.3.0.M1",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.4.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.1",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.4.1",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-base" % "2.4.1",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.4.1",
  "org.glassfish.jersey.core" % "jersey-server" % "2.7",
  "org.glassfish.jersey.containers" % "jersey-container-servlet-core" % "2.7"
)