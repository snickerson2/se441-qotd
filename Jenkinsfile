node {
   stage "Retrieve"
   git 'https://github.com/snickerson2/se441-qotd.git'

   stage "Build"
   def gradleHome = tool 'Gradle 2.11'
   sh "${gradleHome}/bin/gradle assemble uploadArchives"

   step([$class: 'ArtifactArchiver', artifacts: '**/*.war', fingerprint: true])
}

