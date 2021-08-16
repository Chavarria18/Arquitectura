node {
  
  def mvnHome = tool 'M3'
  def pomfilepath= "./pom.xml"
  sh "${mvnHome}/bin/mvn -f ${pomfilepath} verify"
}