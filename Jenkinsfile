pipeline {
    agent any
    
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/VPavithra1432004/finalassesment1'
                      echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
                script {
                    sh 'mvn clean install'
                      echo 'maven build is done'
                }
            }
        }
        stage('docker image'){
            steps{
             
                sh 'docker build -t finalassesment1:${BUILD_NUMBER} -f Dockerfile .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f finalassesment1'
                sh 'docker run --name finalassesment1 -itd -p 9393:9393 finalassesment1:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }



