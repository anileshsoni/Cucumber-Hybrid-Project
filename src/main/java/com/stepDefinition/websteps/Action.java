package com.stepDefinition.websteps;

import java.io.IOException;

import com.project.helper.*;
import com.project.utility.FrameworkConstants;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	TestUtils utility = new TestUtils();
	
	@Given("^The user launched the homepage$")
	public void launchBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		FrameworkConstants.browser = WebDriverManager.chromedriver().create();
		FrameworkConstants.browser.get(utility.getURL());
	}
}
