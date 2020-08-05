
lazy val core = project
  .in(file("core"))
  .settings(
    Settings.common,
    Dependencies.core)

lazy val data = project
  .in(file("data"))
  .dependsOn(core)
  .settings(
      Settings.common,
      Dependencies.core)

lazy val rest = project
  .in(file("rest"))
  .dependsOn(core)
  .settings(
    Settings.common,
    Dependencies.core)

lazy val changingManager = project
  .in(file("changingManager"))
  .dependsOn(core)
  .settings(
    Settings.common,
    Dependencies.core)

lazy val gatherStatistic = project
  .in(file("gatherStatistic"))
  .dependsOn(core)
  .settings(
    Settings.common,
    Dependencies.core)
