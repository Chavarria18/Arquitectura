node{
   
   stage('Compile-Package'){
     withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
        sh "mvn clean package"
      }
   }
   
   stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'maven-3', type: 'maven'
        withSonarQubeEnv('sonar-6') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    }
   
  
   

}