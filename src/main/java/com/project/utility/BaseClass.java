package com.project.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver createDriver(String browserType) {
		
		if(browserType == "chrome") {
			WebDriverManager.chromedriver().setup();
			FrameworkConstants.browser = new ChromeDriver();	
		}
		if(browserType == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			FrameworkConstants.browser = new FirefoxDriver();
		}
		if(browserType == "ie") {
			WebDriverManager.iedriver().setup();
			FrameworkConstants.browser = new InternetExplorerDriver();
		}
		if(browserType == "safari") {
			WebDriverManager.safaridriver().setup();
			FrameworkConstants.browser = new ChromeDriver();
		}
		FrameworkConstants.browser.manage().window().maximize();
		return FrameworkConstants.browser;
	}
}
