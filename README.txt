MAVEN LAB ASSESSMENT - QUICK GUIDE

Project layout:
src/main/java/com/example/App.java
src/test/java/com/example/AppTest.java
pom.xml
Jenkinsfile

App.java contains reusable methods for all 15 lab questions. Each method has a comment describing the operation, not a question number.

AppTest.java currently tests Question 14: Reverse a string.
To adapt it to another question:
1. Open AppTest.java.
2. Change the test calls and assertions to the relevant App.java method.
3. Keep tests under src/test/java/com/example and the package declaration as com.example.

Run tests on your Windows machine:
mvn -s D:\maven-settings.xml clean test

Run the program:
mvn -s D:\maven-settings.xml clean package
java -cp target/classes com.example.App

JENKINS NOTES
- Commit and push this project, including Jenkinsfile, to your GitHub repository.
- Create a Pipeline job in Jenkins and configure it to use the repository URL:
  https://github.com/DommarajuJeevana/Agile_Maven
- If Jenkins uses "Pipeline script from SCM", select Git, enter the repository URL, and set Script Path to Jenkinsfile.
- The Jenkins agent must be a Windows agent for the supplied `bat` step and must have access to D:\maven-settings.xml.
- The Maven installation configured in Jenkins > Manage Jenkins > Tools must be named exactly "Maven", or edit the `maven 'Maven'` name in Jenkinsfile.
- If Maven is already on PATH on the Jenkins agent, remove the `tools { maven 'Maven' }` block.
- IMPORTANT: D:\maven-settings.xml is a path on your computer. If Jenkins runs on another machine/agent, this file must exist at that path on that agent too. For a Linux agent, use `sh` and a Linux settings.xml path instead.
- The GitHub repository must contain this project at the repository root for this Jenkinsfile to work as written.
