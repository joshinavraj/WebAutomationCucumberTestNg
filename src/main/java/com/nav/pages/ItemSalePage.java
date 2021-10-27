package com.nav.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemSalePage {
	public WebDriver driver;

	public ItemSalePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id ="buy-now-button") WebElement buyNowBtn;
	
	
	
	
	public void clickBuyNowBtn() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(buyNowBtn));		
			ele.click();				
	}

}
