pipeline {
    options {
        // 保存最近历史构建记录的数目
        buildDiscarder(logRotator(numToKeepStr: '5'))
        // 禁止pipeline同时执行
        disableConcurrentBuilds()

    }

    agent any

    stages {
        stage("Build") {
            steps {
                sh "mvn clean package"
                sh "printenv"
            }
        }
    }

}