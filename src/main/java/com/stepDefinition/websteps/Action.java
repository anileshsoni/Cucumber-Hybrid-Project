package com.stepDefinition.websteps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.project.helper.*;
import com.project.utility.FrameworkConstants;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	
	TestUtils utility = new TestUtils();
	protected WebDriver driver;
	
	public Action() {
		this.driver = FrameworkConstants.browser;
		
	}

	
	
	@Given("^The user launched the homepage$")
	public void launchBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = WebDriverManager.chromedriver().create();
		driver.get(utility.getURL());
	}
}
