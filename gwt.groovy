pipeline{
  agent any
  triggers{
      GenericTrigger(
        genericVariable:[
          [key:'ref',value:'$.ref']
        ],

        token: env.JOB_NAME,
        causeString:'Triggered on $ref',
        printContributedVariables:true,
        printPostContent:true,

        regexpFilterText: '$ref',
        regexpFilterExpression: 'refs/heads/(master|dev)'
      )
  }

  stages{
      stage('some step'){
        steps{
            sh "echo $ref"
            sh "printenv"
        }
      }
  }

}