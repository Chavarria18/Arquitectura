node {
  agent(label 'DEV')
  
  stages{

     stage ('test') {
      steps{
          dir("Arquitectura"){
            sh "mvn clean verify"
          } 

      }
   
  }

  }
 
}