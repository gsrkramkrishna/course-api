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
			docker build -t gsrkramkrishna/gsrkramkrishna:course-api
			sudo docker push gsrkramkrishna/gsrkramkrishna:course-api
                }
            }
    }
}
