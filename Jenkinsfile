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
		stage('build image') {
			steps {
				bat label: '', script: 'docker build .'
			}
		}
		
		stage('push image') {
			steps {
				bat label: '', script: 'docker push gsrkramkrishna/course-api:2'
			}
		}
	}
}
