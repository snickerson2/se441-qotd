node {
   stage "DEV-QA"
   git 'https://github.com/snickerson2/se441-qotd.git'

   def gradleHome = tool 'Gradle 2.11'
   sh "${gradleHome/bin/gradle assemble uploadArchives"

   step([$class: 'ArtifactArchiver', artifacts: '**/*.war', fingerprint: true])
}
