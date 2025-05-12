pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    extensions: [],
                    userRemoteConfigs: [[
                        credentialsId: 'gitcred',
                        url: 'https://github.com/gitsaravanesh/Jenkins-Java-testing.git'
                    ]]
                )
            }
        }

        stage('Compile') {
            steps {
                bat 'dir'
                bat 'java -version'
                bat 'cd' // Just shows current dir on Windows
                bat 'javac Calc.java'
            }
        }

        stage('Test Add') {
            steps {
                script {
                    bat 'java Calc 10 5 add > result.txt'
                    def result = readFile('result.txt').trim().toDouble()
                    bat 'type result.txt'
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
                    bat 'java Calc 10 5 sub > result.txt'
                    def result = readFile('result.txt').trim().toDouble()
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
                    bat 'java Calc 10 5 mul > result.txt'
                    def result = readFile('result.txt').trim().toDouble()
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
                    bat 'java Calc 10 5 div > result.txt'
                    def result = readFile('result.txt').trim().toDouble()
                    bat 'type result.txt'
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
