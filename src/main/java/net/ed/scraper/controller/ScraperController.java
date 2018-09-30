package net.ed.scraper.controller;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScraperController {
	
	public static WebDriver scraperDriver() {
		
		// add support for chrome driver
		String keyx = "webdriver.chrome.driver";
		String valuex = "/Users/melocal/Applications/lib/chromedriver";
		System.setProperty(keyx, valuex);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		WebElement button = driver.findElement(By.name("btnK"));
		button.sendKeys(Keys.ENTER);
		
        System.out.println("40. fin");
        
        return driver;
	}
	
	public static void scrapeGoogle(WebDriver driver) {
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		WebElement button = driver.findElement(By.name("btnK"));
		button.sendKeys(Keys.ENTER);
		
        System.out.println("53. fin");
		
	}

}
