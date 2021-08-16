node {
  stage('SCM Checkout'){
     git 'https://github.com/Chavarria18/Arquitectura'
   }
  stage('Build'){
    def mvnHome = tool 'M3'  
    sh "${mvnHome}/bin/mvn -f pom.xml verify"

  }
  

}