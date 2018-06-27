// See https://wiki.audaxhealth.com/display/ENG/Build+Structure#BuildStructure-Localconfiguration
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

resolvers += Resolver.url(
  "Rally Plugin Releases",
  url("https://dl.bintray.com/rallyhealth/sbt-plugins")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.rallyhealth.sbt" % "sbt-git-versioning" % "1.0.0")
addSbtPlugin("com.rallyhealth" %% "rally-sbt-plugin" % "0.13.1")
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.3.5")
