pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        tool 'maven'
        sh 'mvn clean install'
      }
    }
  }
}