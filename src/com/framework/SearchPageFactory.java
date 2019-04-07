package com.framework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightTab;
	
	@FindBy(id = "flight-type-one-way-label-hp-flight")
	WebElement oneWayTab;
	
	@FindBy(id = "flight-origin-hp-flight")
	WebElement flyingFromText;
	
	@FindBy(id = "flight-destination-hp-flight")
	WebElement flyingToText;
	
	@FindBy(id = "flight-departing-single-hp-flight")
	WebElement departingDate;
	
	@FindBy(xpath = "//div[@id='flight-departing-wrapper-single-hp-flight']/div[@class='datepicker-dropdown fare-calendar']/div[@class='datepicker-cal']/div[2]/table[@class='datepicker-cal-weeks']/tbody/tr[5]/td[5]/button[@type='button']")
	WebElement selectdate;
	
	@FindBy(xpath = "//div[@id='traveler-selector-hp-flight']//ul[@class='menu-bar-inner']/li/button[@type='button']")
	WebElement Traveller;
	
	@FindBy(xpath= "//div[@id='traveler-selector-hp-flight']//ul[@class='menu-bar-inner']/li/div/footer/div/div[2]/button[@type='button']")
	WebElement travellerClose;
	
	@FindBy(xpath ="//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightTab() {
		flightTab.click();
	}
	
	public void clickOneWayTab() {
		oneWayTab.click();
	}

	public void setFromText(String from) throws Exception {
		flyingFromText.sendKeys(from);
		Thread.sleep(2000);
		flyingFromText.sendKeys(Keys.ENTER);
	}
	
	public void setToText(String to) throws Exception {
		flyingToText.sendKeys(to);
		Thread.sleep(2000);
		flyingToText.sendKeys(Keys.ENTER);
	}
	
	public void departing() {
		departingDate.click();
	}
	
	public void selectDepartingDate() {
		selectdate.click();
	}
	
	public void tarvellerclick() {
		Traveller.click();
	}
	
	public void tarvellerclose() {
		travellerClose.click();
	}
	
	public void searchButton() {
		searchButton.click();
	}
}
