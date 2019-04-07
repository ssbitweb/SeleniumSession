package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotation {
  @Test
  public void method1() {
	  System.out.println("This is methos 1");
  }
  @Test
  public void method2() {
	  System.out.println("This is methos 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("executed before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("executed after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("executed before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("executed after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("executed before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("executed after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("executed before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("executed after suite");
  }

}
