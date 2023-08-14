package com.project.utility;

import org.testng.annotations.*;

import com.project.helper.TestUtils;

import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
	
	static TestUtils utility = new TestUtils();
	
	@BeforeMethod
	public static void createDriver() throws Exception{
		System.out.println("This is before test");
	}

	@AfterMethod
    void teardown() {
		System.out.println("This is After Test");
        FrameworkConstants.browser.quit();
    }

}
