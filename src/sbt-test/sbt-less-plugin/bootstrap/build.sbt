lazy val root = (project in file(".")).addPlugins(SbtWeb)

libraryDependencies += "org.webjars" % "bootstrap" % "3.0.2"
