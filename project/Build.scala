import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2bars"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.jquery" % "jquery" % "1.7.1",
      "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.0.0-rc.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += "webjars" at "http://webjars.github.com/m2"
      // Add your own project settings here      
    )

}
