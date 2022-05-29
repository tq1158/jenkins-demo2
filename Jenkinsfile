pipeline {
    agent any

    options {
        // 保存最近历史构建记录的数目
        buildDiscarder(logRotator(numToKeepStr: '5'))
        // 禁止pipeline同时执行
        disableConcurrentBuilds()
        // 重试次数
        retry(4)
        // 执行chaoshi
        timeout(time: 30, unit: 'MINUTES')
    }


    stages {
        stage("Build") {
            steps {
                script {
                    def browsers = ['chrome', 'firefox']
                    for (i in 0..<browsers.size()) {
                        echo "Testing the ${browsers[i]} browser"
                    }
                }

                sh "mvn clean package"
                sh "printenv"
            }
        }
    }

}