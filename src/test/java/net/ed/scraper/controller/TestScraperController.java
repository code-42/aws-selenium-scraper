package net.ed.scraper.controller;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.ed.scraper.universal_test_driver.Config;
import net.ed.scraper.universal_test_driver.Driver;
import net.ed.scraper.universal_test_driver.DriverTestBaseClass;

public class TestScraperController extends DriverTestBaseClass {
	
	@Test
	public void verifyScraperController() {
		
		Driver.Instance.navigate().to(Config.URL.localhost);
		Driver.Instance = ScraperController.scraperDriver();
		
		String expected = "Selenium Scraper";
		String actual = Driver.Instance.getTitle();
		
		System.out.println("49. expected == " + expected);
		System.out.println("50. actual == " + actual);
		Assert.assertEquals(actual, expected);
		
	}
}
