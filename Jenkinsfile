pipeline{
    agent any

    stages{
        stage("Build"){
            sh "mvn clean package"
            sh "printenv"
        }
    }

}