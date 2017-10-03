pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8-alpine'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        tool 'docker'
        sh 'mvn clean install'
      }
    }
  }
}