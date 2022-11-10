package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewsLandingPageObjects {

	
	public WebDriver driver;
	
	
	public NewsLandingPageObjects(WebDriver driver) {
		
		
		this.driver=driver;
	}

	By SignIn = By.id("idcta-username");
	By Username = By.cssSelector("[type='email']");
	By Password = By.cssSelector("[type='password']");
	By Submit = By.id("submit-button");
	//By CommentIcon= By.xpath("//div[@id='nw-c-topstories-england']//span[contains(@class,'comment__icon')]");
	By CommentIcon =  By.xpath("//a[contains(@class,'comment-count')]");
	
	
	public void SignIn()
	{
		
		
		driver.findElement(SignIn).click();
	}
	
	public void Username(String Username1)
	{
		
		
		driver.findElement(Username).sendKeys(Username1);;
	}
	
	public void Password(String Password1)
	{
		
		
		driver.findElement(Password).sendKeys(Password1);;
	}
	
	public void Submit()
	{
		
		
		driver.findElement(Submit).click();;
	}
	
	public WebElement CommentICon()
	{
		
		
		return driver.findElement(CommentIcon);
	}
	
	public By CommentIconLocator() 
	{
		
		
		return By.xpath("//div[@id='nw-c-topstories-england']//span[contains(@class,'comment__icon')]");
	}
	
	public String getURLTitle()
	{
		
		return driver.getCurrentUrl();
		
	}
	
	
}
