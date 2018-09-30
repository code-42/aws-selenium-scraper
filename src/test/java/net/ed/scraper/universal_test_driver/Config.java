package net.ed.scraper.universal_test_driver;

// Adapted from Common Singleton Driver for Selenium 
// source: https://youtu.be/zAIkKbQN_BE
// edit URL here for class under test

public class Config {
	
	public static class URL{
		public static String google = "https://www.google.com";
		public static String yahoo = "https://login.yahoo.com";
		public static String localhost = "http://localhost:9090/aws-selenium-scraper/";
		public static String scraper = "http://localhost:9090/aws-selenium-scraper/scraper";
		
	}
	
	public static class Browser{
//		public static String browser = "ff";
		public static String browser = "chrome";
	}

}
