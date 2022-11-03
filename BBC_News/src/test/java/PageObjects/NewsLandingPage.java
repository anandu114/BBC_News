package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsLandingPage {

	public WebDriver driver;
	
	By signIn= By.id("idcta-username");
	
	By email= By.cssSelector("[type='email']");
	
	By password = By.cssSelector("[type='password']");
	
	By submit= By.id("submit-button");
	
	By commentIcon=By.xpath("//span[contains(@class,'comment__icon')]");
	
	public NewsLandingPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void signIn() {
		
		
		driver.findElement(signIn).click();
	}
	
	public WebElement email() {
		
		return driver.findElement(email);
		
	}
	
public WebElement password() {
		
		return driver.findElement(password);
		
	}

public void submit() {
	
	
	driver.findElement(submit).click();
}

public WebElement commentIcon() {
	
	
	return driver.findElement(commentIcon);
}


}
