node {

   stage('SCM Checkout'){
     git(
       url: 'https://github.com/Chavarria18/Arquitectura.git',
       credentialsId: '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',
       branch: "${DEV}"
    )
   }
  
  stage('Build'){
   def output = sh returnStdout: true, script: 'ls -l'

  }
  

}