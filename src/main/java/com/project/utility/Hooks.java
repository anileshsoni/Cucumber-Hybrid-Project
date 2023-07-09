package com.project.utility;

import io.cucumber.java.BeforeAll;
import net.bytebuddy.implementation.bytecode.Throw;

public class Hooks {
	
	
	@BeforeAll
	public void launchURL(String appUrl) {
		try {
			if(appUrl.startsWith("https://")) {
				FrameworkConstants.browser.get(appUrl);	
			}
			else {
				Throw.valueOf("URL doesn't contain http://`");
			}
			
		} catch (Exception e) {
			System.out.println("URL Issue: "+e);
		}
		
	}

}
