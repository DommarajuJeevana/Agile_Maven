pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn -s D:\\maven-settings.xml clean test'
            }
        }
    }

    post {
        always {
            junit testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true
        }
        success {
            echo 'Build and JUnit tests passed.'
        }
        failure {
            echo 'Build or tests failed. Check the console output and Surefire reports.'
        }
    }
}
