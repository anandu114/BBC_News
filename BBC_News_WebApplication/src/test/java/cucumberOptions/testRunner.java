package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue= "stepDefinitions", tags="@AutomationTest", monochrome=true)
public class testRunner extends AbstractTestNGCucumberTests{
	
	
	
	@Override
	@DataProvider(parallel=true)
	public Object [] [] scenarios()
		{
		
			return super.scenarios();
		}
	

}
