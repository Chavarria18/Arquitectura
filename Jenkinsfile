node {

stage 'Checkout'
  checkout scm



    
 stage('test') {
        def mvnHome =  tool name: 'M3', type: 'maven'
        sh "ls"
        if (env.BRANCH_NAME == 'DEV') {
            echo 'I only execute on the master branch'
        } else {
            echo 'I execute elsewhere'
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
