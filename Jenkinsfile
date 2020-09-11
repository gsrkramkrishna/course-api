pipeline {
    agent { dockerfile true }
    stages {
        stage('Build') {
            node {    
				def commit = checkout scm    
				echo "Latest commit id: ${commit.GIT_COMMIT}"
			}
        }
    }
}
