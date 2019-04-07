package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElements {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		String title = driver.getTitle();
		System.out.println("webpage Tile is" + title);
		//driver.findElement(By.i("Login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("pune");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("new york");
		driver.findElement(By.id("search-button-hp-package")).click();
		
		
		/*WebElement alrt = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		Assert.assertEquals(alrt.getText(), "Invalid email or password.");
		
		System.out.println(alrt.isDisplayed());
		System.out.println(alrt.isEnabled());
		System.out.println(alrt.isSelected());*/
		System.out.println("success");
		
		/*String CurrentUrl3 = driver.getCurrentUrl();
		System.out.println("current url is: " + CurrentUrl3);
		driver.navigate().back();
		String CurrentUrl2 = driver.getCurrentUrl();
		System.out.println("now url is  " + CurrentUrl2);
		driver.navigate().back();
		String baseurl1 = driver.getCurrentUrl();
		System.out.println("Now url is " + baseurl1);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().refresh();*/
	}

}
