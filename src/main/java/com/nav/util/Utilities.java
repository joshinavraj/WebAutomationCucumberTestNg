package com.nav.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	public static WebElement waitUntilVisible(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static WebElement waitUntilClickble(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
