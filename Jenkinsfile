pipeline {
  agent {
    node {
      label 'slave1'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        bat 'mvn compile'
      }
    }
    stage('test') {
      steps {
        bat 'mvn clean install'
      }
    }
  }
}