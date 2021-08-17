pipeline {
stage 'Checkout'
  checkout scm



    
 stage('test') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        sh "ls"
        when {
        branch 'DEV'
    }
    steps {
        echo 'Corriendo test y analizis sonarq en DEV branch'
    }
        
                
       

        
    }
  stage('email'){
   
    emailext attachLog: false,body: 'Hubo un error en la pipeline', subject: 'Jenkins-pipeline-status', to: 'gchavarriamunoz@gmail.com'
    
  }
  
   


 //def mvnHome = tool 'M3' 
 /*stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn clean sonar:sonar -Dsonar.login=admin -Dsonar.password=tzec99"
        }
    }*/



}
