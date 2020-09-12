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
				bat label: '', script: 'mvn clean install'
			}
		}
		stage('run service') {
			steps {
				bat label: '', script: '''SET %CD% \'/target\'
				java -jar -port=8090 course-api-2.0.0-SNAPSHOT'''
			}
		}
	}
}
