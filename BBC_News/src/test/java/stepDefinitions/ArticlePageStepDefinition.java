package stepDefinitions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import PageObjects.ArticlePage;
import Utils.TestSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ArticlePageStepDefinition extends TestSetup {

	
	TestSetup testSetup;
	
	public ArticlePageStepDefinition(TestSetup testSetup) {
		
		
		this.testSetup=testSetup;
	}
	
	

		@When("The user scroll down and wait for {string} seconds for the comments to display")
		public void the_user_scroll_down_and_wait_for_seconds_for_the_comments_to_display(String waittime) {
			ArticlePage articlePage= new ArticlePage(testSetup.driver);
			try {
				
				articlePage.viewComment();
				}
			
			catch( Exception e)
			{
				
				testSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(waittime)));
			}
			
			
			
			try {
			testSetup.driver.switchTo().frame(articlePage.frame());
				}
			
			catch (Exception e)
			{
				
				System.out.println("No frames found");
			}
			
			
			 WebElement Show= articlePage.ShowComments();
				
			((JavascriptExecutor) testSetup.driver).executeScript("arguments[0].scrollIntoView(true);", Show);
				
			String Comments=articlePage.Comments();
				  
				  
				  if(Comments=="Show")
				  
				  {
					  Assert.assertTrue(true);
					  }
		}
		
		
		
	 
		   
	
			@Then("User can join the conversation and add comments to the article")
			public void user_can_join_the_conversation_and_add_comments_to_the_article() {
				Assert.assertTrue(testSetup.driver.findElement(By.cssSelector(".comments-input-box")).isEnabled());
				testSetup.driver.switchTo().defaultContent();
				testSetup.driver.quit();
			}
	
		
		
		@Then("The user is instructed to Sign in to Comment, reply and react to the article")
		public void the_user_is_instructed_to_sign_in_to_comment_reply_and_react_to_the_article() {
			ArticlePage articlePage= new ArticlePage(testSetup.driver);
			 String joinConversation=articlePage.signinPrompt();
			 
			 
				if(joinConversation.contains("Sign in to comment")) 
				{
					Assert.assertTrue(true);
					}
					else {		
						Assert.assertTrue(false);
					}
				
				testSetup.driver.quit();
				}
		}
	
	
	

