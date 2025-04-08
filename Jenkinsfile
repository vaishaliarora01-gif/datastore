pipeline{
    agent any
    stages{
        stage("checkout code"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vaishaliarora01-gif/datastore.git']])
            }
        }
        stage("building application"){
            steps{
                sh """
                     echo "----------------Building application------------"
                     mvn clean install
                     echo "----------------successfully--------------------"
                   
                """
            }
        }
        stage("Executing testcases"){
            steps{
                sh """
                  echo "execute test cases"
                  mvn test
                  echo "testcase completed"
                """
            }
        }
    }
}