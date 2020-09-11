pipeline {
    agent any
    stages {
		stage('Info') {    
 node {    
 def commit = checkout scm    
    echo "Latest commit id: ${commit.GIT_COMMIT}"
  }
}
}
}
