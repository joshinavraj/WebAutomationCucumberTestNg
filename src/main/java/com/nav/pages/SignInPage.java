package com.nav.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nav.util.Utilities;

public class SignInPage {
	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath ="//label[contains(text(),'E-mail address or mobile phone number')]") WebElement signInLbl;
	@FindBy(id ="ap_email") WebElement signId;
	
	
	
	
	public String getSignInLbl() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(signInLbl));
		return ele.getText();
	}
	public Boolean isSignIdTextBoxPresent() {
		if(signId.isDisplayed()) {
			return true;
		}
		return false;
	}

}
