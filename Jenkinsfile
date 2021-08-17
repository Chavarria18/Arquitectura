node {
stage 'Checkout'{
  checkout scm

}
stage('dev-branch') {
    when {
        branch 'DEV'
    }
    steps {
        echo 'Corriendo test y analizis sonarq en DEV branch'
    }
}

stage('uat-branch') {
    when {
        branch 'UAT'
    }
    steps {
        echo 'Corriendo test y analizis sonarq en UAT branch'
    }
}

stage('prod-branch') {
    when {
        branch 'PROD'
    }
    steps {
        echo 'Corriendo test y analizis sonarq en PROD branch'
        //
    }
}

    
 

}
