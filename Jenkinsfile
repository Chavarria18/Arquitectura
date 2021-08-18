node {

stage 'Checkout'
  checkout scm


 stage('unit-test') {
   try{
      def mvnHome =  tool name: 'M3', type: 'maven'                 
      echo "REALIZANDO LOS UNIT TESTS-2"
      sh "M3 -v"
      echo "a"
      sh "ls"
      sh "${mvnHome}/bin/mvn test" 

   }catch(err){
     emailext attachLog: false,body: 'Hubo un error en los unit test', subject: 'Jenkins-pipeline-status', to: 'gchavarriamunoz@gmail.com'

   }

    
        
    }
                     
                


  stage('SonarQube Analysis') {
    try{
        def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=tzec99"
        }

    }catch(err){
      emailext attachLog: false,body: 'Hubo un error en sonarqube', subject: 'Jenkins-pipeline-status', to: 'gchavarriamunoz@gmail.com'

    }}
  
    

    stage('Build') {
      try{ 
      def mvnHome =  tool name: 'M3', type: 'maven'       
      echo "REALIZANDO LOS UNIT TESTS"
      sh "${mvnHome}/bin/mvn build"
      }catch(err){
        emailext attachLog: false,body: 'Hubo un error en el build', subject: 'Jenkins-pipeline-status', to: 'gchavarriamunoz@gmail.com'
      }
        
        
    } 
    



}
