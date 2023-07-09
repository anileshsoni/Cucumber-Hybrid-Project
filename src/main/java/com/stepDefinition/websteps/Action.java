package com.stepDefinition.websteps;

import com.project.helper.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Action {
	
	WebBase base = new WebBase();
	
	@Given("^The user launched the homepage$")
	public void launchBrowser() {
		WebBase.browser = base.createDriver("Chrome");
		base.openURL("https://www.amazon.in/");
	}
	
	@When("I clicked on sign in button")
	public void i_clicked_on_sign_in_button() {
	    System.out.println("Clicked on sign in button");
	}
}
