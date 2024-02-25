To convert junit results file to octane results run:

`mvn com.microfocus.adm.almoctane.bdd:bdd2octane:run -DreportFiles="target/surefire-reports/TEST-MyBankAppTest.xml" -DfeatureFiles="src/test/resources/MyBankApp.feature" -Dframework="cucumber-jvm" -DresultFile="octane-result.xml"`

In Jenkins create a freestyle project.
These are the build steps:
cp -R ~/Desktop/octane/bdd-demo/* ${WORKSPACE}/

mvn test

These are the post-build steps:
/opt/homebrew/Cellar/maven/3.8.5/bin/mvn com.microfocus.adm.almoctane.bdd:bdd2octane:run -DreportFiles="target/surefire-reports/TEST-MyBankAppTest.xml" -DfeatureFiles="src/test/resources/MyBankApp.feature" -Dframework="cucumber-jvm" -DresultFile="octane-result.xml"

add the step above twice. one for failure and another for success.