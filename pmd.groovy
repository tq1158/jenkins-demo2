pipeline {
    agent any

    stages {
        stage('pmd') {
            steps {
                sh "mvn clean package"
            }
        }
    }

    post {
        always {
//            pmd(canRunOnFailed: true, pattern: "**/target/pmd.xml")
            junit testResults: '**/target/surefire-reports/*.xml'
        }
    }
}