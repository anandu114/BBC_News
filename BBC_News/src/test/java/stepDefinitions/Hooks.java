package stepDefinitions;

import java.io.IOException;


import Utils.TestSetup;
import io.cucumber.java.After;

public class Hooks {
	
	TestSetup setup= new TestSetup();
		
	
	@After
	public void AfterScenario() throws IOException
	{
		
		
		setup.WebDriverManager().quit();
	
	}

}
