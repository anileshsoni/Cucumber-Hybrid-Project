package com.project.helper;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebBase {

	
	public static WebDriver browser;
	
	public WebDriver createDriver(String browserType) {
		if (browserType == "Chrome") {
			System.out.println("Inside Chrome Driver");
			System.setProperty("webdriver.chrome.driver", "/Users/anileshsoni/Downloads/chromedriver_mac64/chromedriver");		
			browser = new ChromeDriver();
			browser.manage().window().maximize();
		}
		if (browserType == "Safari") {
			System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + "/resource/driver/chromedriver.exe");
			browser = new ChromeDriver();
			browser.manage().window().maximize();
		}
		
		return browser;
	}
	
	public void openURL(String url) {
		browser.get(url);
	}
}
