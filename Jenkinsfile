node {
  stage('SCM Checkout'){
    git 'https://github.com/Chavarria18/Arquitectura',
      credentialsID: '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'
   }
  stage('Build'){
    def mvnHome = tool 'M3'  
    sh "${mvnHome}/bin/mvn -f pom.xml verify"

  }
  

}