package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectSetup {
	
	public WebDriver driver;
	public NewsLandingPageObjects landingPage;
	public ArticleLandingPageObjects articlePage;
	
	public PageObjectSetup(WebDriver driver)
	{
		
		this.driver = driver;
		
	}

	
	public NewsLandingPageObjects NewsLandingPage()
	{
		
		landingPage= new NewsLandingPageObjects(driver);
		return landingPage;
	}
	
	public ArticleLandingPageObjects ArticlePage()
	{
		
		articlePage= new ArticleLandingPageObjects(driver);
		return articlePage;
	}
}
