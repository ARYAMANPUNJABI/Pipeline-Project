pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://gitrepolink'
                
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Build your HTML project here"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'python -m http.server 80 &'
               sh 'sleep 5'
               sh 'curl http://yourserverpublicip'
            }
        }
    }
}
