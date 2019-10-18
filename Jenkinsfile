pipeline {
	agent any
	tools {
         maven 'Maven 3.6.2'
         jdk 'jdk8'
        }
	stages {
	    stage ('Initialize') {
            steps {
                 echo 'Initialize'

            }
        }
		stage ('Clean') {
		    steps {
			   echo 'Cleaning in progress'
			   bat 'mvn clean'
		    }
		}
		stage ('Test') {
            steps {
        	   echo 'Testing in progress'
        	   bat 'mvn test'
            }
        }
        stage ('Build') {
            steps {
    		   echo 'Building in progress'
    		   bat 'mvn package'
    	    }
   		}
   		stage ('Deploy') {
             steps {
                echo 'Deploy'
             }
        }
	}
}