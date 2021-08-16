node {
stage 'Checkout'

    checkout scm

 //def mvnHome = tool 'M3' 
 stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    }

}