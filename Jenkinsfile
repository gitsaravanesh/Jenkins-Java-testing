pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '1aa2132a-26ca-4c29-aa04-0c5cb36a7445', url: 'https://github.com/gitsaravanesh/B2-DevOps-Java-Jenkins']])
            }
        }
        
        stage('Compile') {
            steps {
                sh 'ls'
                sh 'java --version'
                sh 'pwd'
                sh 'java Calc.java 15 10 add'
            }
        }
        
        stage('Test Add') {
            steps {
                script {
                    // Test addition
                    sh 'java Calc.java 10 5 add > result'
                    def result = readFile('result').trim().toDouble()
                    sh 'cat result'
                    if (result == 15.0) {
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
                    sh 'cat result'
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
