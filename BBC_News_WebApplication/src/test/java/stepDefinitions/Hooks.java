package stepDefinitions;


import java.io.IOException;

import Utils.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
	
	public TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		
		
		this.testContextSetup=testContextSetup;
		
	}
	
	@After("@AutomationTest")
	public void AfterScenario() throws IOException
	
	{
		
		testContextSetup.testBase.InitializeDriver().quit();
		
	}

}
