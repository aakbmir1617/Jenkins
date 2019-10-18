pipeline {
	agent any
	tools {
         maven 'Maven 3.6.2'
         jdk 'jdk8'
        }
	stages {
	    stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    '''
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