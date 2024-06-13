#!/usr/bin/env groovy

def call() {
    echo "Running SonarQube Analysis..."

    // Define your SonarQube server configuration credentials ID
    def sonarqubeCredentialsId = 'sonar-token'

    // Define other properties for SonarQube analysis
    def projectName = 'saeed'
    def projectKey = 'saeed'

    // Run withSonarQubeEnv to inject SonarQube environment variables
    withSonarQubeEnv(credentialsId: sonarqubeCredentialsId) {
        sh """
        ${tool 'SonarQube'}  // Optionally specify SonarQube scanner tool installation if configured in Jenkins
        sonar-scanner -Dsonar.projectName=${projectName} \
                      -Dsonar.projectKey=${projectKey} \
                      -Dsonar.java.binaries=.
        """
    }
}
