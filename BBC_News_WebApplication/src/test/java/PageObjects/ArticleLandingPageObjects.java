package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ArticleLandingPageObjects {

	public WebDriver driver;

	public ArticleLandingPageObjects(WebDriver driver) {
		
		
		this.driver=driver;
	}

	
	By displayComments = By.cssSelector(".view-comments-button");
	By selectFrame = By.cssSelector("[title='Comments']");
	By showComments = By.xpath("//label[text()='Show']");
	By commentBox = By.cssSelector(".comments-input-box");
	By signInPrompt = By.cssSelector("p.comments__signin--prompt");
	By viewCommentsButton= By.xpath("//div[@aria-live='polite']/button");
	
	public void displayComments()
	{
		
		driver.findElement(displayComments).click();
		
	}
	
	public void switchToFrame()
	{
		
		driver.switchTo().frame(driver.findElement(selectFrame));
		
		
	}
	
	public WebElement showComments()
	{
		
		return driver.findElement(showComments);
		
		
	}
	
	public WebElement commentBox()
	{
		
		return driver.findElement(commentBox);
		
		
	}
	
	public WebElement signInPrompt()
	{
		
		return driver.findElement(signInPrompt);
		
		
	}
	
	public WebElement viewCommentsButton()
	{
		
		return driver.findElement(viewCommentsButton);
		
		
	}
}
