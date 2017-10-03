pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8-alpine'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}