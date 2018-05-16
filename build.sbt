
val baseSettings = Seq(
  organization := "com.ejesposito",
  scalaVersion := "2.12.6",
  autoScalaLibrary := false
)

lazy val javaTraining = (project in file("."))
  .settings(baseSettings:_*)
  .settings(
    packagedArtifacts := Map.empty
  )
  .aggregate(
    `step_1_basics`,
    `step_2_oop`
  )

lazy val `step_1_basics` = (project in file("src/step_1_basics"))
  .settings(baseSettings:_*)
  .settings(
    name := "step_1_basics",
    moduleName := "step_1_basics",
    version := "1.0.0"
  )

lazy val `step_2_oop` = (project in file("src/step_2_oop"))
  .settings(baseSettings:_*)
  .settings(
    name := "step_2_oop",
    moduleName := "step_2_oop",
    version := "1.0.0"
  )
