package Utility;

import org.openqa.selenium.WebElement;

public class ActionUtility {
	public static void sendkeys(WebElement ele,String datatoEnter) {
		ele.sendKeys(datatoEnter);
	}
	public static void enterFirstName(WebElement ele,String datatoEnter) {
		sendkeys(ele,datatoEnter);
	}
	public static void enterLastName(WebElement ele,String datatoEnter) {
		sendkeys(ele,datatoEnter);
	}
	public void clear(WebElement ele) {
		ele.clear();
}
	public String getTextMsg(WebElement ele) {
		String msg=ele.getText();
		return msg;
	}
		
}
