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
				bat label: '', script: 'cd target'
			}
		}
		stage('run service') {
			steps {
				bat label: '', script: 'java -jar course-api-2.0.0-SNAPSHOT'
			}
		}
	}
}
