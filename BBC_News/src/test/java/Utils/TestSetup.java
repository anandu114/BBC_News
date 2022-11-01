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

public class TestSetup {
	
	public WebDriver driver;

	
	public WebDriver WebDriverManager() throws IOException {
		
		
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//global.properties");
		prop.load(fis);
		
		String browsername= prop.getProperty("browser");
	
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
			
			else if (browsername.equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
				
			}
			else if (browsername.equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				
					
				
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		return driver;
		
		}
		
	public void launchapplication() throws IOException
	{
		driver= WebDriverManager();
		
	}
	
	
	
		
		
	}
	
	
	


