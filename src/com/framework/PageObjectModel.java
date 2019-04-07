package com.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		SearchPage.flightTab(driver);
		SearchPage.oneWayTab(driver);
		SearchPage.flyingFromTextBox(driver);
		SearchPage.flyingToTextBox(driver);
		SearchPage.departing(driver);
		SearchPage.traveller(driver);
		SearchPage.clickOnSearchButton(driver);
		System.out.println("success");
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
