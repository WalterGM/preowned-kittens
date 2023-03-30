name := "preowned-kittens"

version := "1.0"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.20.0" % Test)

def PreownedKittenProject(name: String): Project = (
  Project(name, file(name))
  )

lazy val common = (
  PreownedKittenProject("common").
    settings(
      libraryDependencies +=
        "org.specs2" %% "specs2-core" % "4.20.0" % Test
    )
  )
val analytics = (
  PreownedKittenProject("analytics").
    dependsOn(common).
    settings()
  )
val website = (
  PreownedKittenProject("website").
    dependsOn(common).
    settings()
  )