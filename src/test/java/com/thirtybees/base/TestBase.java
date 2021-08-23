package com.thirtybees.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static WebDriver driver =null;
	Properties prop;
	public static Logger log = Logger.getLogger(TestBase.class);
	public WebDriver initialization(String propertyfileName) throws Exception {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
		
		System.getProperty("user.dir") + "/src/main/resources/"+propertyfileName);		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			log.info("initializing browser");
			log.warn("chromedriver file should be at specific location");
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			
			log.info("chrome browser opened");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			log.info("initializing browser");
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			log.info("mozilla firefox browser opened");
			driver = new FirefoxDriver();
		} 
		 else if (browserName.equalsIgnoreCase("IE")) {
	    	 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\ie.exe");
	         driver = new InternetExplorerDriver();
	      }
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   return driver;
		}
		
}
