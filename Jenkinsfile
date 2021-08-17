node {

stage 'Checkout'
  checkout scm


 stage('unit-test') {
    def mvnHome =  tool name: 'M3', type: 'maven'       
    echo "REALIZANDO LOS UNIT TESTS"
    sh "${mvnHome}/bin/mvn test"
        
        
    } 


  stage('SonarQube Analysis') {
    def mvnHome =  tool name: 'M3', type: 'maven'
        withSonarQubeEnv('sonarq') { 
          sh "${mvnHome}/bin/mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=tzec99"
        }
    }

    stage('Build') {
      def mvnHome =  tool name: 'M3', type: 'maven'       
      echo "REALIZANDO LOS UNIT TESTS"
      sh "${mvnHome}/bin/mvn build"
        
        
    } 
    



}
