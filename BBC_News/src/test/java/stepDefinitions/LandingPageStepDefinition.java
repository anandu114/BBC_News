package stepDefinitions;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.NewsLandingPage;
import Utils.TestSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageStepDefinition extends TestSetup {

	public WebDriver driver;
TestSetup testSetup;
	
	public LandingPageStepDefinition(TestSetup testSetup) {
		
		
		this.testSetup=testSetup;
	}
	
	
    @Given("^A User navigates to the BBC News page and sign in using following details$")
    public void a_user_navigates_to_the_bbc_news_page_and_sign_in_using_following_details(DataTable data) throws Throwable {
     
    	
    	
    	WebDriverManager.chromedriver().setup();
		testSetup.driver= new ChromeDriver();
	
		testSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		testSetup.driver.manage().window().maximize();
		testSetup.driver.get("https://www.bbc.co.uk/news");
		
		
		NewsLandingPage landingpage=new NewsLandingPage(testSetup.driver);
		
		landingpage.signIn();
		List<List<String>> obj=data.asLists();
		landingpage.email().sendKeys(obj.get(0).get(0));
		landingpage.password().sendKeys(obj.get(0).get(1));
		landingpage.submit();
    }

	
	@Given("A User navigates to the BBC News page")
	public void a_user_navigates_to_the_bbc_news_page() {
		
		WebDriverManager.chromedriver().setup();
		testSetup.driver= new ChromeDriver();
		testSetup.driver.get("https://www.bbc.co.uk/news");
	}
	
	
	 @When("^The user clicks on the comment icon of a Top News in the main page and lands on the article page$")
	    public void the_user_clicks_on_the_comment_icon_of_a_top_news_in_the_main_page_and_lands_on_the_article_page() throws Throwable {
		
		 NewsLandingPage landingpage=new NewsLandingPage(testSetup.driver);
		 landingpage.commentIcon();
		 
	    }
			
	}

