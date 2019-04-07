package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_Methods {

	WebDriver driver;

	public Generic_Methods(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(String locType, String locValue) {
		locValue = locValue.toLowerCase();
		if(locType.equals("id")) {
			System.out.println("Element id locator value is "+ locValue);
			return this.driver.findElement(By.id(locType));
		}else if(locType.equals("xpath")) {
			System.out.println("Element xpath locator value is "+ locValue);
			return this.driver.findElement(By.xpath(locType));
		}else {
			System.out.println("Not valid Locator Type");
			return null;
		}
	}
}
