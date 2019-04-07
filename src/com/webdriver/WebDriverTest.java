package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Automation\\Projects\\LetsKodeIt\\lib\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Projects\\LetsKodeIt\\lib\\drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium_Automation\\Projects\\LetsKodeIt\\lib\\drivers\\IEDriverServer.exe");
		
		// or set environment variable..i.e C:\Selenium_Automation\Projects\LetsKodeIt\lib\drivers;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.id("p7kjtbalatabgcoloroverlay")).click();
		//driver.findElement(By.linkText("Practice")).click();
		
		/*element ->  <a class="navbar-link fedora-navbar-link" href="/sign_in" style="" xpath="1"> Login</a> */
		
		
		// Login xpath original
		//driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
		//xpath reduced..
		//driver.findElement(By.xpath("//div[@id=\"navbar\"]//ul/li[2]/a")).click();
		
		// to reduce white space
		//     //div[@id=\"navbar"]//a[contains(text(),'Login')]
		
		//     //div[@id='navbar']//a[contains(@class,'navbar-­‐link') and contains(@href,'sign_in')]

		//     //div[@id='navbar']//a[starts-with(@class,'navbar-link')]
		
		/*Parent
		Syntax:
		xpath-­‐to-­‐some-­‐element//parent::<tag>
		Preceding
		Sibling
		Syntax:
		xpath-­‐to-­‐some-­‐element//preceding-­‐sibling::<tag>
		Following
		Sibling
		Syntax:
		xpath-­‐to-­‐some-­‐element//following-­‐sibling::<tag>
		
		
*/		
		//enrole now xpath
		//*[@id="block-1754138"]/div/div/div/a
		// or
		///html//div[@class='view-school']/div/div[1]//div[@class='container']//a[@href='/sign_up']
		
		//reduced to
		//     //div[@class='homepage-hero']//a[text()='Enroll now']
		

		System.out.println("success");

	}

}
