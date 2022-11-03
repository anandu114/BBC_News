# BBCNEWS_Test Automation
This contains the Testing framework for automating BBC News Web Application(https://www.bbc.co.uk/news) to verify the commenting functionality
# Getting Started
Use Eclipse IDE to clone and import this project using the below code respository
https://github.com/anandu114/BBC_News.git

The Scope of this Assignment involves testing the BBC News web application to verify the commenting feature of the Top News displayed in BBC News page

# Assumptions:
1. https://www.bbc.co.uk/news is the URL used for automation and not the article URL
2. **Atleast one of the Top News have commenting feature enabled in the BBC News page at the time of execution to run the two automated Scenarios.**
3. There are two types of commenting icon present in BBC News page( black colour and red colour). Since the functionality is not known, script handles both the commenting icon by Exeception handling
4. Wait time is taken as 5 seconds

# Prerequisites to run the testing Framework
Eclipse IDE and Java 1.8 

# Installation and settingup project
Open Eclipse IDE
<br/>Import by cloning remote project from the repository : https://github.com/anandu114/BBC_News.git
<br/>Right click Project -> Maven -> Update Project
<br/>Right click Project -> Run As -> Maven clean
<br/>Right click Project -> Run As -> Maven test
<br/>Test Execution reports can be found in Project->target->cucumber-reports

# Running the Tests

From CLI:
<br/>Right click Project -> Run As -> Maven clean
<br/>Right click Project -> Run As -> Maven test
<br/>Test Execution reports can be found in Project->target->surefire-reports

From Eclipse:
<br/>Right Click /BBC_News/src/test/java/cucumberOptions/testRunner.java -> Run As -> TestNG Test

