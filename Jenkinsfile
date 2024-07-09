pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'cloudtechtrainer', url: 'https://github.com/cloudtechtrainer/B2-Java-Jenkins.git']])
        }
        
        stage('Compile') {
            steps {
                sh 'ls'
                sh 'java --version'
                sh 'pwd'
                sh 'javac Calc.java'
                sh 'java Calc 15 10 add'
            }
        }
        
        stage('Test Add') {
            steps {
                script {
                    // Test addition
                    sh 'java Calc 10 5 add > result'
                    echo result
                    def result = readFile('result').trim().toDouble()
                    if (result == 14.0) {
                        echo 'Addition test passed'
                    } else {
                        echo 'test failed'
                        error 'Addition test failed'
                    }
                }
            }
        }
        
        stage('Test Sub') {
            steps {
                script {
                    // Test subtraction
                    sh 'java Calc.java 10 5 sub > result'
                    def result = readFile('result').trim().toDouble()
                    if (result == 5) {
                        echo 'Subtraction test passed'
                    } else {
                        error 'Subtraction test failed'
                    }
                }
            }
        }
        
        stage('Test Mul') {
            steps {
                script {
                    // Test multiplication
                    sh 'java Calc.java 10 5 mul > result'
                    def result = readFile('result').trim().toDouble()
                    if (result == 50) {
                        echo 'Multiplication test passed'
                    } else {
                        error 'Multiplication test failed'
                    }
                }
            }
        }
        
        stage('Test Div') {
            steps {
                script {
                    // Test division
                    sh 'java Calc.java 10 5 div > result'
                    def result = readFile('result').trim().toDouble()
                    if (result == 2) {
                        echo 'Division test passed'
                    } else {
                        error 'Division test failed'
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'No deployment needed'
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline execution completed'
        }
    }
}
