package net.ed.scraper.universal_test_driver;

// Adapted from Common Singleton Driver for Selenium 
// source: https://youtu.be/zAIkKbQN_BE

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverTestBaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		Driver.Initialize();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
//	@Test(priority=1)
//	public void test1() {
//		System.out.println("test1");
//	}
//	
//	@Test(priority=2)
//	public void test2() {
//		System.out.println("test2");
//	}
//	
//	@Test(priority=3)
//	public void test3() {
//		System.out.println("test3");
//	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
		Driver.close();
		Driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
