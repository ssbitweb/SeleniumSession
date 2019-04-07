package com.webdriver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_Introduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("executed before first method in class");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("executed after last method in class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("executed before each method");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("executed after each method");

	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

}
