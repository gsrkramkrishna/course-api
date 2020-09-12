pipeline {
    agent any
       stages {
		stage('clone code') {
			steps {
				git url: 'https://github.com/gsrkramkrishna/course-api/'
			}
		}
		stage('build code') {
			steps {
				sh 'mvn clean install'
			}
		}
	}
}
