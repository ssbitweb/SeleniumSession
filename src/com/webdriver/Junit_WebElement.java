package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit_WebElement {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("sachinbhagat@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("0123456789");
		driver.findElement(By.name("commit")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("success");
	}

}
