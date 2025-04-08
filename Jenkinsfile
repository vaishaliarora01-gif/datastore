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
                     ./mvnw clean install
                     echo "----------------successfully--------------------"
                   
                """
            }
        }
    }
}