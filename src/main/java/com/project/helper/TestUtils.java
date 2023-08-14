package com.project.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import com.project.utility.FrameworkConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtils {

	Properties properties;

	/**
	 * Get Current time stamp
	 * @return
	 */
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		return format.format(date);
	}

	/**
	 * Get Current time stamp
	 * @return
	 */
	public static String getTime(String time) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("time");
		return format.format(date);
	}

	/**
	 * Load properties from framework.properties file
	 */
	public void loadProperties() {
		properties= new Properties();
		try {
			properties.load(new FileInputStream(getRelativePath()+"/resource/dataFiles/framework.properties"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getRelativePath() {
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		if (relativePath.endsWith("bin")) {
			relativePath = new File(System.getProperty("user.dir")).getParent();
		}
		return relativePath;
	}
	/**
	 * Get property value 
	 * @param key property key
	 * @return value of the property
	 * @throws 
	 */
	public String getSettings(String key) {
		return properties.getProperty(key);
	}

	/**
	 *	Get the environment under test 
	 * @throws IOException 
	 */
	public String getEnvironmentToTest() throws IOException{
//		FileInputStream fis = new FileInputStream(getRelativePath()+"/resource/dataFiles/framework.properties");
//		properties.load(fis);
		loadProperties();
		String test;
		test = properties.getProperty("testEnv","QA");
		return test;
	}

	public String getURL() throws IOException
	{	
		switch (getEnvironmentToTest())
		{
		case "QA":
			return getSettings("URL_QA");
		case "STG":
			return getSettings("URL_STG");
		case "SOAK":
			return getSettings("URL_SOAK");
		default :
			return getSettings("URL_QA");

		}
	}
}
