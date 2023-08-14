package com.project.testRunner;

import cucumber.api.CucumberOptions;


//@cucumber.api.CucumberOptions(
//		tags = "", 
//		features = {"/src/test/java/com/test/LoginTest/loginTest.feature"}, 
//		glue = {"com.example.definitions"},
//		plugin = {})

@CucumberOptions(
		features = "/src/test/java/com/test/LoginTest/loginTest.feature", 
		tags={ ""}, 
		plugin = {"html:target3/cucumber-html-report","json:target3/cucumber.json", "junit:target3/cucumber.xml","rerun:target/rerun.txt" }, 
		glue = "com.stepDefinition")

public class TestRunner {
}