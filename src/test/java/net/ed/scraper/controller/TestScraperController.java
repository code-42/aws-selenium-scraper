package net.ed.scraper.controller;

//Adapted from Common Singleton Driver for Selenium 
//source: https://youtu.be/zAIkKbQN_BE
//edit URL in package net.ed.scraper.universal_test_driver.Config.java

import org.testng.Assert;
import org.testng.annotations.Test;

import net.ed.scraper.universal_test_driver.Config;
import net.ed.scraper.universal_test_driver.Driver;
import net.ed.scraper.universal_test_driver.DriverTestBaseClass;

public class TestScraperController extends DriverTestBaseClass {
	
	@Test
	public void verifyScraperController() {
		
		Driver.Instance.navigate().to(Config.URL.localhost);
		Driver.Instance = ScraperController.scraperDriver();
		
		Assert.assertNotNull(Driver.Instance);
	}
}
