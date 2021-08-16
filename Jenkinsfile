node {
 //def mvnHome = tool 'M3' 
 stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'M#', type: 'maven'
        withSonarQubeEnv('sonar-6') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    }

}