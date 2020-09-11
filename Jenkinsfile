pipeline {  environment {
    registry = "https://hub.docker.com/r/gsrkramkrishna/course-api"
    registryCredential = 'dockerhub'
  }  agent any  stages {
    stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
  }
}
