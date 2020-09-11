pipeline {
    agent any
        stages {
		    stage('Build Info') {
                steps {
			echo 'Building..'
                    	def commit = checkout scm
                    	echo "Latest commit id: ${commit.GIT_COMMIT}"
                }
            }
    }
}
