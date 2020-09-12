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
		stage('change folder') {
			steps {
				bat label: '', script: 'cd workspace/course-service/target'
			}
		}
		stage('open command prompt window') {
			steps {
				bat label: '', script: 'cmd'
			}
		}
		stage('run service') {
			steps {
				bat label: '', script: 'java -jar -port=8090 course-api-2.0.0-SNAPSHOT'
			}
		}
	}
}
