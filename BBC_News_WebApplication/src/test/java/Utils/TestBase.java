package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver InitializeDriver() throws IOException {
		
		
		Properties prop= new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//Global.properties");
		prop.load(fis);
		
		String URL= prop.getProperty("URL");
		String browser= prop.getProperty("browser");
		
		if (driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				
			}
			
			if(browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
			    driver=new FirefoxDriver();
				
			}
			
			if(browser.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
			    driver=new EdgeDriver();
				
			}
			
		    driver.get(URL);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		    return driver;
		
		
	}

}
