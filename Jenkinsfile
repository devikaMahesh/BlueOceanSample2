pipeline {
  agent {
    node {
      label 'slave1'
    }
    
  }
  stages {
    stage('Test') {
      steps {
        bat 'mvn clean install'
      }
    }
  }
}