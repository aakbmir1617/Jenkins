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
                 sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }
		stage ('Clean') {
		    steps {
			   echo 'Clean'
		    }
		}
		stage ('Test') {
            steps {
        	   echo 'Test'
            }
        }
        stage ('Build') {
            steps {
    		   echo 'Build'
    	    }
   		}
   		stage ('Deploy') {
             steps {
                echo 'Deploy'
             }
        }
	}
}