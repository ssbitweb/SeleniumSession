package com.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryFramework {
	private WebDriver driver;
	private String baseurl;
	SearchPageFactory searchpage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseurl = "https://www.expedia.com/";
		searchpage = new SearchPageFactory(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
	}

	@Test
	public void test() throws Exception {
		searchpage.clickFlightTab();
		searchpage.clickOneWayTab();
		searchpage.setFromText(" Pune");
		searchpage.setToText(" New York");
		searchpage.departing();
		searchpage.selectDepartingDate();
		searchpage.tarvellerclick();
		searchpage.tarvellerclose();
		searchpage.searchButton();
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
