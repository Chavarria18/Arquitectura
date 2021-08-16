node {

    stage('SCM Checkout'){
      steps{
         git branch: 'DEV' 
            credentialsId: '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'
            url: 'https://github.com/Chavarria18/Arquitectura.git'
      }
    
   }
 //def mvnHome = tool 'M3' 
 stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    }

}