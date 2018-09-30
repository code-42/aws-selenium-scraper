package net.ed.scraper.universal_test_driver;

// Adapted from Common Singleton Driver for Selenium 
// source: https://youtu.be/zAIkKbQN_BE

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver Instance = null;
	private static String key_ff = "webdriver.gecko.driver";
	private static String value_ff = "/Users/melocal/Applications/lib/geckodriver";
	private static String key_chrome = "webdriver.chrome.driver";
	private static String value_chrome = "/Users/melocal/Applications/lib/chromedriver";
	
	public static void Initialize() {
		if(Instance == null) {
			System.out.println("Initializing Driver...");
			if(Config.Browser.browser.equalsIgnoreCase("ff")) {
				System.setProperty(key_ff, value_ff);
				Instance = new FirefoxDriver();				
			}
			
			else if(Config.Browser.browser.equalsIgnoreCase("chrome")) {
				System.setProperty(key_chrome, value_chrome);
				Instance = new  ChromeDriver();
			}

		}
		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
	}
	
	public static void close() {
		System.out.println("Closing browser...");
		Instance.close();
		Instance=null;
	}
	
	public static void quit() {
		System.out.println("Quit browser");
		Instance.quit();
		Instance=null;
	}

}
