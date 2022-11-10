package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectSetup;

public class TestContextSetup {
	
	
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectSetup pageObject;
	public TestBase testBase;
	public ReusableMethods resuableMethods;

	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObject = new PageObjectSetup(testBase.InitializeDriver());
		resuableMethods = new ReusableMethods(testBase.InitializeDriver());
		
		
		

	}

}
