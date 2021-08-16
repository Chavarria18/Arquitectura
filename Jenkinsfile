pipeline {
  agent any
  tools {
     def mvnHome = tool 'M3'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
  }
}