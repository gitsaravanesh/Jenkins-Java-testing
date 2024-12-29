# Jenkins Pipeline for Testing a Simple Java Program

This repository contains a Jenkinsfile to automate the testing of a simple Java program, `Calc.java`, which performs basic arithmetic operations like addition, subtraction, multiplication, and division. The pipeline validates the functionality of the program through various stages and ensures reliability before deployment.

---

## **Pipeline Overview**

The Jenkins pipeline is designed to perform the following stages:

1. **Checkout**: Clones the repository from GitHub.
2. **Compile**: Lists files, checks the Java version, and runs the `Calc.java` program.
3. **Test Add**: Validates the addition functionality.
4. **Test Sub**: Validates the subtraction functionality.
5. **Test Mul**: Validates the multiplication functionality.
6. **Test Div**: Validates the division functionality.
7. **Deploy**: Placeholder for deployment (not used in this case).
8. **Post Actions**: Displays a message upon pipeline completion.

---

## **Requirements**

### **1. Jenkins Configuration**
- Jenkins installed and running.
- Git and Java installed on the Jenkins agent.
- A configured credential in Jenkins with `credentialsId: '1aa2132a-26ca-4c29-aa04-0c5cb36a7445'`.
- Access to the GitHub repository: [B2-DevOps-Java-Jenkins](https://github.com/gitsaravanesh/B2-DevOps-Java-Jenkins).

### **2. Environment**
- Java Development Kit (JDK) installed (ensure compatibility with `Calc.java`).
- `Calc.java` file present in the repository, implementing arithmetic operations with the following syntax:

