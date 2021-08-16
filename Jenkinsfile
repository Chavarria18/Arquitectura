node {
stages{


stage 'Checkout'

    checkout scm
 stage('test') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        sh "ls"
       

        
    }
  }
   post {  
         always {  
             echo 'This will always run'  
         }  
         success {  
             echo 'This will run only if successful'  
         }  
         failure {  
             emailext body: 'Hubo un error en la pipeline', subject: 'Jenkins-pipeline-status', to: 'chavarria181386@unis.edu.gt'
         }  
         }


 //def mvnHome = tool 'M3' 
 /*stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=tzec99"
        }
    }*/



}