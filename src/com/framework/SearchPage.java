package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;

	public static void flightTab(WebDriver driver) {
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();
	}
	public static void oneWayTab(WebDriver driver) {
		element = driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
		element.click();;
	}
	public static WebElement flyingFromTextBox(WebDriver driver) throws Exception {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.sendKeys(" Pune");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		return element;
	}
	public static WebElement flyingToTextBox(WebDriver driver) throws Exception {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.sendKeys(" New York");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		return element;
	}
	public static WebElement departing(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-single-hp-flight"));
		element.click();
		element = driver.findElement(By.xpath("//div[@id='flight-departing-wrapper-single-hp-flight']/div[@class='datepicker-dropdown fare-calendar']/div[@class='datepicker-cal']/div[2]/table[@class='datepicker-cal-weeks']/tbody/tr[5]/td[5]/button[@type='button']"));
		element.click();
		return element;
	}
	public static void traveller(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']//ul[@class='menu-bar-inner']/li/button[@type='button']"));
		element.click();
		element.findElement(By.xpath("//div[@id='flight-departing-wrapper-single-hp-flight']/div[@class='datepicker-dropdown fare-calendar']/div[@class='datepicker-cal']/div[2]/table[@class='datepicker-cal-weeks']/tbody/tr[5]/td[7]/button[@type='button']"));
		element.click();
	}
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		return element;
	}
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
}
