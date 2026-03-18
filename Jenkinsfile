pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat '"C:\\Program Files\\Apache\\Maven\\apache-maven-3.9.14\\bin\\mvn.cmd" clean compile'
            }
        }
        stage('Test') {
            steps {
                bat '"C:\\Program Files\\Apache\\Maven\\apache-maven-3.9.14\\bin\\mvn.cmd" test'
            }
        }
        stage('Package') {
            steps {
                bat '"C:\\Program Files\\Apache\\Maven\\apache-maven-3.9.14\\bin\\mvn.cmd" package -DskipTests'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t myapp:latest .'
            }
        }
        stage('Deploy') {
            steps {
                bat 'docker stop myapp-container || exit 0'
                bat 'docker rm myapp-container || exit 0'
                bat 'docker run -d -p 8080:8080 --name myapp-container myapp:latest'
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs.'
        }
    }
}