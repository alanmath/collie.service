pipeline {
    agent any
    stages {
        stage ('Jenkins Service') {
            steps {
                echo 'Service interface'
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}