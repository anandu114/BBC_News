# BBC News
 <br/>BDD testing framework developed from scratch to automate the validation of commenting feature in BBC News Web Application

## Getting Started
 <br/>Use IDEs like Eclipse or IntelliJ to clone and import this project using the below code repository
 <br/>https://github.com/anandu114/BBC_News.git

  <br/>The Scope involves
  <br/>Verify whether a registered User can comment on the Top News article present in BBC News Web Application
  <br/>Verfiy whether a non registered user is asked to Sign in to comment on the Top News Article
  
  ## Assumptions
  <br/> Since the requirement of diplaying the comment icons as red or black colour under a Top News is not known, testing framework handles both comment icons using Exception handling
  <br/> Wait time is taken as 5 seconds
  
  ## Prerequisites
  IDE like Eclipse or IntelliJ and JDK 1.8 installed.
  
  ## Installing
  <br/> Open Eclipse IDE
  <br/>Import by cloning remote project from the repository : https://github.com/anandu114/BBC_News.git
  <br/>Right click Project -> Maven -> Update Project
  <br/>Right click Project -> Run As -> Maven clean
  <br/>Right click Project -> Run As -> Maven test
  <br/>Test Execution reports can be found in Project->target->cucumber-reports

  ##Running the tests

    Method 1:

    Right click Project -> Run As -> Maven clean

    Right click Project -> Run As -> Maven test

    Test Execution reports can be found in Project->target->cucumber-reports

    Method 2:

    BBC_News_WebApplication/src/test/java/cucumberOptions/testRunner.java -> Run As -> TestNG Test


  
