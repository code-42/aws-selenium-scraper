package net.ed.scraper.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;

public class YahooLoginUtil implements IYahooLogin {
	
	WebElement element;
	
	@Value("${loginURL}")
	private String loginURL;
    
    @Value("${username}")
    private String username;
    
    @Value("${password}")
    private String password;

	// no-arg constructor
    public YahooLoginUtil() {
		System.out.println("23. inside LoginUtil() no-arg constructor");
	}
    
	public WebDriver getLoggedIn(WebDriver driver) {
		
		try {
			System.out.println("35. getting driver.getCurrentUrl()... ");
			driver.get(loginURL);
			
			driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);			 
			driver.findElement(By.id("login-username")).sendKeys(username); // fill in the blanks
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			driver.findElement(By.name("signin")).click();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			driver.findElement(By.id("login-passwd")).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			driver.findElement(By.name("verifyPassword")).click();
			System.out.println("46. fin getLoggedIn()... " + driver.getCurrentUrl());

			// WebDriverWait causes session is null then crash
//			element = (new WebDriverWait(driver, 60))
//					 .until(ExpectedConditions.elementToBeClickable(By.name("username")));
//			 element.click();
//
//			 element = (new WebDriverWait(driver, 60))
//	    			 .until(ExpectedConditions.elementToBeClickable(By.name("password")));
//			 element.click();
//				
//	       	 element = (new WebDriverWait(driver, 60))
//	    			 .until(ExpectedConditions.elementToBeClickable(By.name("verifyPassword")));
//	    	 element.click();
		       		    	 
		} catch (TimeoutException e) {
			e.printStackTrace();
			driver.quit();
		}
		return driver;
	}
	
}


