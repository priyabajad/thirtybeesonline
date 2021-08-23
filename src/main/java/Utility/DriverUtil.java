package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {
	static WebDriver driver = null;
	static long time = 0;

public static void  waitForElement(WebElement element) {

		
				WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void fluentWait(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
	     wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
}
		
		