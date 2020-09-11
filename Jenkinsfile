pipeline {
    agent { dockerfile true }
    stages {
        stage('Build') {
            steps {
                node {
				def commit = checkout scm
				echo "Latest commit id: ${commit.GIT_COMMIT}"
				}
            }
        }
    }
}
