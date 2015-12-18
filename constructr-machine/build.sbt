name := "constructr-machine"

libraryDependencies ++= List(
  Library.akkaActor,
  Library.akkaCluster,
  Library.akkaTestkit % "test",
  Library.scalaTest   % "test"
)

initialCommands := """|import de.heikoseeberger.constructr.machine._""".stripMargin
