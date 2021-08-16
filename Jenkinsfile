node {

  try {
    // Fails with non-zero exit if dir1 does not exist
    def dir1 = sh(script:'ls -la dir1', returnStdout:true).trim()
} catch (Exception ex) {
    println("Unable to read dir1: ${ex}")
}
  

}