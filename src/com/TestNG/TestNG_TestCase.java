package com.TestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.Screenshots;
import com.framework.SearchPageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestNG_TestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchpage;
	ExtentReports report;
	ExtentTest test;
 
  @BeforeMethod
  public void beforeMethod() {
	  baseUrl = "https://www.expedia.com/";
	  ChromeOptions option = new ChromeOptions();
	  option.addExtensions(new File("C:\\Users\\SACHIN\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\hoklmmgfnpapgjgcpechhaamimifchmp\\5.4.0_0.crx"));
	  report = new ExtentReports("C:\\Users\\SACHIN\\Desktop\\SearchFlightTest.html");
	  test = report.startTest("Verify Search Flight Test");
	  driver = new ChromeDriver(option);
	  test.log(LogStatus.INFO, "Browser is Started...");
	  searchpage = new SearchPageFactory(driver);
	  
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser is Maximized...");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
	  test.log(LogStatus.INFO, "Opening BaseUrl i.e. Website is opening...");
  }
  @Test
  public void TestNGMethod() throws Exception {
	 
	  searchpage.clickFlightTab();
	  test.log(LogStatus.INFO, "Clicking on Flight Tab...");
	  searchpage.clickOneWayTab();
	  test.log(LogStatus.INFO, "Clicking on OneWay Tab...");
	  searchpage.setFromText(" Pune");
	  test.log(LogStatus.INFO, "Sending From Text...");
	  searchpage.setToText(" New York");
	  test.log(LogStatus.INFO, "Sending To Text...");
	  searchpage.departing();
	  test.log(LogStatus.INFO, "Clicking on Departing Textbox...");
	  searchpage.selectDepartingDate();
	  test.log(LogStatus.INFO, "Filling Departing Date...");
	  searchpage.tarvellerclick();
	  test.log(LogStatus.INFO, "Clicked on Traveller...");
	  searchpage.tarvellerclose();
	  test.log(LogStatus.INFO, "Closing Traveller PopUp...");
	  searchpage.searchButton();
	  test.log(LogStatus.PASS, "Clicked on Search Button- verified Search Flight Test...");
	 
  }

  @AfterMethod
  public void afterMethod(ITestResult testresult) throws IOException {
	  if(testresult.getStatus() == ITestResult.SUCCESS) {
		  String path = Screenshots.takeScreenshot(driver, testresult.getName());
		  String imagePath = test.addScreenCapture(path);
		  test.log(LogStatus.PASS, "Search Flight Test case is passed", imagePath);
	  }
	  //driver.close();
	  report.endTest(test);
	  report.flush();
  }

}
