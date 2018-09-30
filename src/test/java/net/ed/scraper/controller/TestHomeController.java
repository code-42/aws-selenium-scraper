package net.ed.scraper.controller;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomeController {
	
	public WebDriver driver;
	public String baseUrl = "http://localhost:9090/aws-selenium-scraper/";
	
	@BeforeTest
	public void launchBrowser() {
		// add support for chrome driver
		String keyx = "webdriver.chrome.driver";
		String valuex = "/Users/melocal/Applications/lib/chromedriver";
		System.setProperty(keyx, valuex);
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomepageTitle() {
		String expected = "Selenium Scraper";
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
