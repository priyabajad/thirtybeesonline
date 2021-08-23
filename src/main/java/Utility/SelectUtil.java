package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {
	 public static void selectByText(WebElement element,String text) {
		 Select p=new Select(element);
		 p.selectByVisibleText(text);
		 
	 }
	 public void selectByValue(WebElement element,String value) {
		 Select p=new Select(element);
		 p.selectByValue(value);
		 
	 }
	 public static void selectByIndex(WebElement element,int i) {
		 Select p=new Select(element);
		 p.selectByIndex(i);
		 
	 }
	
		
	}
