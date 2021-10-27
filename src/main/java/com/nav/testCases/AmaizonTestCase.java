package com.nav.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nav.pages.BaseClass;
import com.nav.pages.HomePage;
import com.nav.pages.ItemSalePage;
import com.nav.pages.SignInPage;
import com.nav.util.BrowserFactory;

public class AmaizonTestCase extends BaseClass{
//	public WebDriver driver1;
//	public WebDriver driver2;
	
	
//	Go to amazon.ca in every test case
	@Test
	public void test1() {
//		WebDriver driver;
		BrowserFactory bf=new BrowserFactory();
		WebDriver driver=bf.startApplication(prop.getProperty("browser"), prop.getProperty("URL"));
		HomePage homePage1=PageFactory.initElements(driver, HomePage.class);
		
//		Click on hamburger menu (top left corner)
		homePage1.clickHamburgerMenu();
//		Select Kindle under Digital Content and Devices
		homePage1.clickDeviceKendle();
//		Click Kindle under Kindle E-Reader
		homePage1.clickLinkKendle();
//		Click Buy Now
		ItemSalePage itemSalePage1=PageFactory.initElements(driver, ItemSalePage.class);
		itemSalePage1.clickBuyNowBtn();
		
//		Verify User is asked for email or mobile number
		SignInPage signInPage1=PageFactory.initElements(driver, SignInPage.class);
		String signInLbl1=signInPage1.getSignInLbl();
		System.out.println("sigh in lbl: "+signInLbl1);
		
//		Verifying label containing information
		assertEquals(signInLbl1, "E-mail address or mobile phone number");
		
//		Verifying login ID text box present or not
		assertTrue(signInPage1.isSignIdTextBoxPresent());
		driver.close();
	
		
	}
	
	
	@Test
	public void test2() {
		WebDriver driver;
		BrowserFactory bf=new BrowserFactory();
		driver=bf.startApplication(prop.getProperty("browser2"), prop.getProperty("URL"));
		HomePage homePage=PageFactory.initElements(driver, HomePage.class);
		
//		Click on hamburger menu (top left corner)
		homePage.clickHamburgerMenu();
//		Select Kindle under Digital Content and Devices
		homePage.clickDeviceKendle();
//		Click Kindle under Kindle E-Reader
		homePage.clickLinkKendle();
//		Click Buy Now
		ItemSalePage itemSalePage=PageFactory.initElements(driver, ItemSalePage.class);
		itemSalePage.clickBuyNowBtn();
		
//		Verify User is asked for email or mobile number
		SignInPage signInPage=PageFactory.initElements(driver, SignInPage.class);
		String signInLbl=signInPage.getSignInLbl();
		System.out.println("sigh in lbl: "+signInLbl);
		
//		Verifying label containing information
		assertEquals(signInLbl, "E-mail address or mobile phone number");
		
//		Verifying login ID text box present or not
		assertTrue(signInPage.isSignIdTextBoxPresent());
	
		driver.close();
	}


}
