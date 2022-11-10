package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	
	public WebDriver driver;
	public ReusableMethods(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public void ExplicitWait(int duration, By elementLocator)
	{
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
	}

}
