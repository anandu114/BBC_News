package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.NewsLandingPageObjects;
import PageObjects.PageObjectSetup;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class NewsLandingPageStepDefiniton 
{

	public TestContextSetup testContextSetup;
	public  WebDriver driver;
	public PageObjectSetup pageObject;
	NewsLandingPageObjects landingPage;
	
	
	public NewsLandingPageStepDefiniton(TestContextSetup testContextSetup)
	{
		
	this.testContextSetup=testContextSetup;
	this.landingPage= testContextSetup.pageObject.NewsLandingPage();
	}
	
	
	
	
    @Given("^A User navigates to the BBC News page and sign in using following details$")
    public void a_user_navigates_to_the_bbc_news_page_and_sign_in_using_following_details(DataTable data) throws Throwable 
    {
     
    	Assert.assertTrue(landingPage.getURLTitle().contains("news"));
    	NewsLandingPageObjects landingPage= testContextSetup.pageObject.NewsLandingPage();
		
		List<List<String>> obj=data.asLists();
		String Username= obj.get(0).get(0);
		String Password= obj.get(0).get(1);
		landingPage.SignIn();
		landingPage.Username(Username);
		landingPage.Password(Password);
		landingPage.Submit();
		
    }

	
	@Given("A User navigates to the BBC News page")
	public void a_user_navigates_to_the_bbc_news_page() throws IOException 
	{
		
	
		Assert.assertTrue(landingPage.getURLTitle().contains("news"));
	}
	
	
	 @When("^The user clicks on the comment icon of a Top News in the main page and lands on the article page$")
	    public void the_user_clicks_on_the_comment_icon_of_a_top_news_in_the_main_page_and_lands_on_the_article_page() throws IOException 
	{
		 
		 NewsLandingPageObjects landingPage= testContextSetup.pageObject.NewsLandingPage();
		 //testContextSetup.resuableMethods.ExplicitWait(5,landingPage.CommentIconLocator());
		 
		 ((JavascriptExecutor) testContextSetup.testBase.InitializeDriver()).executeScript("arguments[0].scrollIntoView(true);", landingPage.CommentICon());
		 landingPage.CommentICon().click();;
		 
		 
	}
	
	
	
	
	
}

