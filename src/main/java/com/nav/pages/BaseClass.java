package com.nav.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nav.util.BrowserFactory;



public class BaseClass {
	

	public static Properties prop;
	String currentDirectory = System.getProperty("user.dir");
	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(currentDirectory+"/Config/conf.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
