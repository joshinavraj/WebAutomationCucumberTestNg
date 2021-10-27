package com.nav.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
   String currentDirectory = System.getProperty("user.dir");
   WebDriver driver;
	
	public  WebDriver startApplication(String browserName, String appURL) {
		
		if(browserName.equalsIgnoreCase("Chrome")) 
			
		{
			
			System.setProperty("webdriver.chrome.driver",currentDirectory+ "/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("chrome Browser lunched");
			
		}else if(browserName.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",currentDirectory+"/Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}else 
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver= new ChromeDriver();
			
		}
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().window().maximize();
		
		return driver;
	}
	


}