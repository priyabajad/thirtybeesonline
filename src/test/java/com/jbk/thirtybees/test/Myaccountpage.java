package com.jbk.thirtybees.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myaccountpage {	
		WebDriver driver;
		public Myaccountpage(WebDriver driver) {
			this.driver=driver;
				PageFactory.initElements(driver, this);
			}
@Test
public void verifymyaccount() {
	ArrayList<String> expectedMenu = new ArrayList<String>();
	ArrayList<String> actualMenus = new ArrayList<String>();
	
	List<WebElement> actmenus=driver.findElements(By.tagName("//td")); 
	for(WebElement element : actmenus) {
		actualMenus.add(element.getText());
		DataFormatter df=new DataFormatter();
		Workbook wb=null;
		try {
			FileInputStream fis=new FileInputStream (
		System.getProperty("user.dir")+"/src/test/resources/"+
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		
	Assert.assertEquals(actmenus,expectedMenu);	
	}
}

	
}
}


	


