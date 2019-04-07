package com.webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practice_Page {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;
	WebElement element;
	//Generic_Methods gm;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl1 = "https://letskodeit.teachable.com/";
		baseUrl2 = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(baseUrl1);
		//gm = new Generic_Methods(driver);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']")).click();
	}
/*
	@Test
	public void radioButton() throws Exception {
		
		boolean ischecked = false;
		List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = radio.size();
		System.out.println(size);
		for(int i = 0; i<size; i++) {
			ischecked = radio.get(i).isSelected();
			
			if(!ischecked) {
				radio.get(i).click();
				Thread.sleep(2000);
			}
		}
		System.out.println("success");
	}
	
	@Test
	public void dropDown() throws Exception {
		element = driver.findElement(By.id("carselect"));
		element.click();
		Select sel = new Select(element);
		Thread.sleep(2000);
		System.out.println("select by index");
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		System.out.println("select by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("select by visible text");
		sel.selectByVisibleText("Honda");
		
		Thread.sleep(2000);
		System.out.println("printing all options");
		List<WebElement> option = sel.getOptions();
		int size = option.size();
		for(int i =0; i<size; i++) {
			String optionName = option.get(i).getText();
			System.out.println(optionName);
		}
	}
	
	@Test
	public void multiSelect() throws Exception {
		element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		Thread.sleep(2000);
		System.out.println("select orange by value");
		sel.selectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("de-select orange by value");
		sel.deselectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("select peach by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("select Apple by visibletext");
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(2000);
		System.out.println("print all selected option");
	    List<WebElement> selectedOption = sel.getAllSelectedOptions();
	    for(WebElement option : selectedOption) {
	    	System.out.println(option.getText());
	    }
	    
	    Thread.sleep(2000);
		System.out.println("de-select all selected option");
		sel.deselectAll();
	}
	@Test
	public void hideShowLetsKodeIt() throws Exception {
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("text box is displayed "+ textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		hidebutton.click();
		System.out.println("clicked on hide button");
		System.out.println("text box is displayed "+ textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		showbutton.click();
		System.out.println("clicked on show button");
		System.out.println("text box is displayed "+ textBox.isDisplayed());
		
		Thread.sleep(3000);
	}
	
	@Test
	public void hideShowExpedia() throws Exception {
		driver.get(baseUrl2);
		
		WebElement childdropdown = driver.findElement(By.className("gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-child-age-1-1-hc"));
		System.out.println("childdropdown is displayed "+ childdropdown.isDisplayed());
		
	}*/
	@Test
	public void searchFlight() throws Exception {
		driver.get(baseUrl2);
		WebElement flight = driver.findElement(By.id("tab-flight-tab-hp"));
		flight.click();
		WebElement oneWay = driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
		oneWay.click();
		WebElement origin = driver.findElement(By.id("flight-origin-hp-flight"));
		origin.sendKeys("Pune");
		Thread.sleep(5000);
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.id("flight-destination-hp-flight"));
		destination.sendKeys(" New Y");
		Thread.sleep(5000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		WebElement departure = driver.findElement(By.id("flight-departing-single-hp-flight"));
		departure.click();
		Thread.sleep(5000);
		WebElement date = driver.findElement(By.xpath("//div[@class='datepicker-cal']//div[2]//table[1]//tbody[1]//tr[5]//td[3]//button[1]"));
		date.click();
		Thread.sleep(5000);
		WebElement search =driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		Thread.sleep(3000);
		search.click();
		System.out.println("success");
	}
		
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String character = "abcdefghijklmnopqrstuvqxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i = 0; i < length; i++) {
			int index = (int)Math.random() *character.length();
			sb.append(character.charAt(index));
		}
		return sb.toString();
	}
	
	@After
	public void tearDown() throws Exception {
		String fileName = "TC_Search_Flight_" + getRandomString(5) + ".png";
		String directory = "C:\\Users\\SACHIN\\Desktop\\";
		
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sourcefile, new File(directory + fileName) );
		driver.close();
	}

}
