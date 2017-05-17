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
    stage('Test') {
      steps {
        bat 'mvn clean install'
      }
    }
    stage('Ready') {
      steps {
        echo 'Ready to deploy'
      }
    }
  }
}