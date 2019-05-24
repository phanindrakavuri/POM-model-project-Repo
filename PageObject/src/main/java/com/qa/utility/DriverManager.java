package com.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager 
{
	public static WebDriver driver;

	
	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String FIREFOX_DRIVER_PATH = PROJECT_PATH + "//drivers//firefoxdriver.exe";
  
	public static final String CHROME_DRIVER_PATH = PROJECT_PATH + "//drivers//chromedriver.exe";
			
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_PATH);
			driver =new FirefoxDriver();
		}
		return driver;
	}
	
}
