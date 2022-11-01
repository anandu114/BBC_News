package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage {

	public WebDriver driver;
	
	By frame= By.cssSelector("[title='Comments']");
	
	By showComments= By.xpath("//label[text()='Show']");
	
	By commentBox= By.cssSelector(".comments-input-box");
	
	By signinPrompt=  By.cssSelector("p.comments__signin--prompt");
	
	By viewComment= By.cssSelector(".view-comments-button");
	
	
	public ArticlePage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public WebElement frame() {
	
	
	return driver.findElement(frame);
	}

	public WebElement ShowComments() {
	
	
	return driver.findElement(showComments);}

	public String Comments() 
	{
	
	
		
	return driver.findElement(showComments).getText();
	
	}
	
	public String commentBox() {
		
		return driver.findElement(commentBox).getText();
		
	}
public String signinPrompt() {
		
		return driver.findElement(signinPrompt).getText();
		
	}

public void viewComment() {
	
	driver.findElement(viewComment).click();
}
}
