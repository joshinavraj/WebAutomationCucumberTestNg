package com.nav.stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nav.pages.BaseClass;
import com.nav.pages.HomePage;
import com.nav.pages.ItemSalePage;
import com.nav.pages.SignInPage;
import com.nav.util.BrowserFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmaizonStepDefinitions{
	WebDriver driver;
	HomePage homePage;
	ItemSalePage itemSalePage;
	SignInPage signInPage;
	

	@Given("I open {string} browser and I Go to {string} site")
	public void i_open_browser_and_i_go_to_site(String string, String string2) {
		BrowserFactory bf=new BrowserFactory();
		driver=bf.startApplication(string, string2);
	}

	@When("I Click on hamburger menu \\(top left corner)")
	public void i_click_on_hamburger_menu_top_left_corner() {
		homePage=PageFactory.initElements(driver, HomePage.class);
		
//		Click on hamburger menu (top left corner)
		homePage.clickHamburgerMenu();
	}

	@When("I Select Kindle under Digital Content and Devices")
	public void i_select_kindle_under_digital_content_and_devices() {
		homePage.clickDeviceKendle();
	}

	@When("I Click Kindle under Kindle E-Reader")
	public void i_click_kindle_under_kindle_e_reader() {
		homePage.clickLinkKendle();
	}

	@When("I Click Buy Now button")
	public void i_click_buy_now_button() {
		 itemSalePage=PageFactory.initElements(driver, ItemSalePage.class);
		itemSalePage.clickBuyNowBtn();
	}

	@Then("I Verify User is asked for email or mobile number")
	public void i_verify_user_is_asked_for_email_or_mobile_number() {
		signInPage=PageFactory.initElements(driver, SignInPage.class);
		String signInLbl=signInPage.getSignInLbl();
		System.out.println("sigh in lbl: "+signInLbl);
		assertEquals(signInLbl, "E-mail address or mobile phone number");
	}

	@Then("I verify there is userId text box")
	public void i_verify_there_is_user_id_text_box() {
		assertTrue(signInPage.isSignIdTextBoxPresent());
	}
	@Then("I closed the browser")
	public void i_closed_the_browser() {
	    driver.close();
	}

}
