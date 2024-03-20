pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'redbox', url: 'https://github.com/4redbox/java-jenkins-demo.git']])            }
        }
        
        stage('Compile') {
            steps {
                sh 'ls'
                sh 'java --version'
                sh 'pwd'
            }
        }
        
        stage('Test Add') {
            steps {
                script {
                    // Test addition
                    sh 'javac calc.java'
                    sh 'java calc.java 10 4 add > result'
                    def result = readFile('result').trim().toDouble()
                    echo "Addition test Result: ${result}" // Print the result along with the message
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
                    sh 'java calc.java 10 5 sub > result'
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
                    sh 'java calc.java 5 5 mul > result'
                    def result = readFile('result').trim().toDouble()
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
                    sh 'java calc.java 10 5 div > result'
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
