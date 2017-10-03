pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        tool 'docker'
        sh 'mvn clean install'
      }
    }
  }
}