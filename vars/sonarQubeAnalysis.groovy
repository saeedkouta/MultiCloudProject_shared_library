#!usr/bin/env groovy
def call(){ 
	echo "Running SonarQube "
	withSonarQubeEnv(credentialsId: 'sonar-token') {
		echo "Running SonarQube Analysis..."
		sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=saeed \
		-Dsonar.java.binaries=. \
		-Dsonar.projectKey=saeed '''
	}
}
