pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                sh 'java --version'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'cloudtechtrainer', url: 'https://github.com/cloudtechtrainer/B2-Java-Jenkins']])
                sh 'ls'
            }
        }
        stage('Compile') {
            steps {
                sh 'javac Calc.java'
                sh 'ls'
            }
        }
        
        stage('Test Add') {
            steps {
                script {
                    // Test addition
                    sh 'java Calc 10 4 add > result'
                    def result = readFile('result').trim().toDouble()
                    echo "Test Result: ${result}"
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
                    sh 'java Calc 10 4 sub > result'
                    def result = readFile('result').trim().toDouble()
                    echo "Test Result: ${result}"
                    if (result == 6) {
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
                    sh 'java Calc 5 5 mul > result'
                    def result = readFile('result').trim().toDouble()
                    echo "Test Result: ${result}"
                    if (result == 25) {
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
                    sh 'java Calc 10 5 div > result'
                    def result = readFile('result').trim().toDouble()
                    echo "Test Result: ${result}"
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
