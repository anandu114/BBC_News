package stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import PageObjects.ArticleLandingPageObjects;
import PageObjects.PageObjectSetup;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArticlePageStepDefinition {
	
	
	public TestContextSetup testContextSetup;
	public  WebDriver driver;
	public PageObjectSetup pageObject;
	ArticleLandingPageObjects articlePage;
	
	public ArticlePageStepDefinition(TestContextSetup testContextSetup)
	{
		
	this.testContextSetup=testContextSetup;
	this.articlePage= testContextSetup.pageObject.ArticlePage();
	}

	
	
	@When("^The user scroll down and wait for \"([^\"]*)\" seconds for the comments to display$")
    public void the_user_scroll_down_and_wait_for_something_seconds_for_the_comments_to_display(int waititime) throws Throwable {
		
		
		 ArticleLandingPageObjects articlePage = testContextSetup.pageObject.ArticlePage();
		
		try {
			
			articlePage.displayComments();
			}
		
		catch( Exception e)
		{
			
			System.out.println("Comments displayed by default");
		}
		
		
		
		try {
		
			articlePage.switchToFrame();
		
		}
		
		catch(Exception e) {
			
			
			System.out.println("No frames found");
		}
	       
		 WebElement Show= articlePage.showComments();
		 
		((JavascriptExecutor) testContextSetup.testBase.InitializeDriver()).executeScript("arguments[0].scrollIntoView(true);", Show);

			  String Comments=articlePage.showComments().getText();
			  
			  
			  if(Comments=="Show")
			  
			  {
				  Assert.assertTrue(true);}
			  
	}
	
	
	@Then("User can join the conversation and add comments to the article")
	public void user_can_join_the_conversation_and_add_comments_to_the_article() throws IOException {
		
		ArticleLandingPageObjects articlePage = testContextSetup.pageObject.ArticlePage();
		
		Assert.assertTrue(articlePage.commentBox().isEnabled());
		testContextSetup.testBase.InitializeDriver().switchTo().defaultContent();
		
	}
	
	
	 @Then("The user is instructed to Sign in to Comment, reply and react to the article")
	    public void the_user_is_instructed_to_sign_in_to_comment_reply_and_react_to_the_article() 
	 {
		 ArticleLandingPageObjects articlePage = testContextSetup.pageObject.ArticlePage();
		 
		 
		 String joinConversation=articlePage.signInPrompt().getText();
		 
		 if(joinConversation.contains("Sign in to comment")) 
		 	
		 	{
			 	Assert.assertTrue(true);
			}
		 else 
			 
			{		
			 	Assert.assertTrue(false);
			}
		 
			
	 }
	 
	
	
}
