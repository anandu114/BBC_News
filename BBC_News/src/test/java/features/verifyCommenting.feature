Feature: Verify the viewing of comments in BBC News Web Application

@AutomationTest
Scenario: Verify if a registered user can view and add the comments of a Top News in BBC News web Application
Given A User navigates to the BBC News page and sign in using following details
| anandu114@gmail.com | Anandu@123 |
When The user clicks on the comment icon of a Top News in the main page and lands on the article page
And The user scroll down and wait for "5" seconds for the comments to display
Then User can join the conversation and add comments to the article

@AutomationTest
Scenario: Verify if the User is prompted to sign in to comment on the Top News story in the BBC News Application
Given A User navigates to the BBC News page
When The user clicks on the comment icon of a Top News in the main page and lands on the article page
And The user scroll down and wait for "5" seconds for the comments to display
Then The user is instructed to Sign in to Comment, reply and react to the article

@ManualTest
Scenario: Verify whether a registered user can add reply to the already existig comments of a Top News Article present on the BBC News page
#Given: A registered user lands on the BBC News homepage and clicks on the Top News with commenting feature enabled
#When The user clicks on the "view comments" button present at the botom of the article
#Then The user should be able to click on the Reply button for all the comments present
#And A comment box should be displayed when the user clicks on the Reply button
#And User should be able to type the comments in the comment box

@ManualTest
Scenario: Verify Whether the User can filter the already existing comments present on an article in the BBC News Application
#Given: A registered user lands on the BBC News homepage and clicks on the Top News with commenting feature enabled
#When The user clicks on the "view comments" button present at the botom of the article
#Then The user should see all the existing comments of the article
#And User should be able to click on the filter dropdown button and filter based on "Highest Rated", "Most Replied", "Oldest", "Latest"

@ManualTest
Scenario: Verify if a registered User below "13" years is not allowed to comment on articles not suitbale for the age group
#Given: A registered user below "13" years old lands on the BBC News homepage and clicks on the Top News with commenting feature enabled
#When The user clicks on the "view comments" button present at the botom of the article
#Then The message "Sorry, it looks like you’re not the right age to use this here." is displayed on the comments frame for article which is not suitable for the age

@ManualTest
Scenario: Verify if a registered User is not allowed to do both like and dislike for an already existing comment of a Top News Article present on the BBC News Page
#Given: A registered user lands on the BBC News homepage and clicks on the Top News with commenting feature enabled
#When The user clicks on the "view comments" button present at the botom of the article
#Then The user should see all the existing comments of the article
#And The User should be allowed to click either of the like or dislike button
#And The last selected option of like or dislike is saved as the final response of the user

@ManualTest
Scenario: Verify whether the Total Comments count displyed in comments frame below the Top News article is equal to the the total comments of the article
#Given: A registered user lands on the BBC News homepage and clicks on the Top News with commenting feature enabled
#When The user clicks on the "view comments" button present at the botom of the article
#Then The user should see the Total Comments of the article
#And The total comments count displyed should be equal to the total number of comments present for the article
