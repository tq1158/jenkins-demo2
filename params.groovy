pipeline{
  agent any
  parameters{
      booleanParam(name:'userFlag',defaultValue:true,description:'用户标志位')
      password(name:'password',defaultValue:'SECRET',description:'密码')
      string(name:'deployEnv',defaultValue:'staging',description:'部署环境')
      choice(name:'choices',choices:'dev\n\test\nstaging',description:'环境选项')
  }

  stages{
      stage('foo'){
        steps{
            echo "flag:${params.userFlag}"
        }
      }
  }

}