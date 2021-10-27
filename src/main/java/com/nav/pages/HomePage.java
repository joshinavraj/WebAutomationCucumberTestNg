package com.nav.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nav.util.Utilities;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id ="nav-hamburger-menu") WebElement hamburgermenu;
	@FindBy(xpath ="//div[contains(text(),'Kindle')]") WebElement deviceKendle;
	@FindBy(linkText = "Kindle") WebElement linkKendle;
	
	
	
	public void clickHamburgerMenu() {
		hamburgermenu.click();
	}
	
	public void clickDeviceKendle() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(deviceKendle));
		ele.click();
//		deviceKendle.click();
	}

	public void clickLinkKendle() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(linkKendle));
		ele.click();
//		Utilities.waitUntilClickble(driver, linkKendle);
//		linkKendle.click();
	}


}
