pipeline {
    agent any
        stages {
		    stage('Build Info') {
                steps {
			echo 'Building..'
                    	checkout scm
                    	echo "checkout done..."
			cd course-service
			mvn cleani nstall
			docker build gsrkramkrishna/course-api
			sudo docker push gsrkramkrishna/course-api + ":$BUILD_NUMBER"
                }
            }
    }
}
