package net.ed.scraper.controller;

// Adapted from Common Singleton Driver for Selenium 
// source: https://youtu.be/zAIkKbQN_BE
// edit URL in package net.ed.scraper.universal_test_driver.Config.java

import org.testng.Assert;
import org.testng.annotations.Test;

import net.ed.scraper.universal_test_driver.Config;
import net.ed.scraper.universal_test_driver.Driver;
import net.ed.scraper.universal_test_driver.DriverTestBaseClass;

public class TestHomeController extends DriverTestBaseClass{
	
	@Test
	public void verifyHomepageTitle() {
		Driver.Instance.navigate().to(Config.URL.localhost);
		String expected = "Home page";
		String actual = Driver.Instance.getTitle();
		System.out.println("21. expected == Home page");
		System.out.println("22. actual == " + actual);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyScraperTitle() {
		Driver.Instance.navigate().to(Config.URL.scraper);
		String expected = "Scraper";
		String actual = Driver.Instance.getTitle();
		System.out.println("31. expected == Scraper");
		System.out.println("32. actual == " + actual);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyYahooLogin() {
		Driver.Instance.navigate().to(Config.URL.yahoologin);
		String expected = "Yahoo - login";
		String actual = Driver.Instance.getTitle();
		System.out.println("41. expected == Yahoo - login");
		System.out.println("42. actual == " + actual);
		Assert.assertEquals(actual, expected);
	}
}
