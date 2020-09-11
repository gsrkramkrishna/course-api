pipeline {
    agent any
        stages {
		    stage('Build Info') {
                steps {
			echo 'Building..'
                    	checkout scm
                    	echo "checkout done..."
			cd course-service
			echo 'changed directory to course-service folder ..'
			mvn cleani nstall
			echo 'build done and created jar'
			cd target
			echo 'changed directory to target folder ..'
			
                }
            }
    }
}
