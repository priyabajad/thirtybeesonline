package com.jbk.thirtybees.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.ActionUtility;
import Utility.ExcelUtility;
import Utility.SelectUtil;

public class Myaccount {
	WebDriver driver;
	public Myaccount(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	@Test
	public String verifycreateaccount() {
		try {
		 driver.findElement(By.xpath("//ul[@class='list-unstyled']//li//a[contains(text(),account')]")).click();
	} catch(NoSuchElementException e) {
		System.out.println(" handledexception");
	}
		 driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
		 driver.findElement(By.xpath("//input[ @name='email_create'and @data-validate='isEmail']")).sendKeys("priyanka@gmail.com");
		driver.findElement(By.xpath("//button[@class='navbar-toggle collapsed']")).click();
		driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
	String exp="An account using this email address has already been registered. Please enter a valid password or request a new one.";
	WebElement actual=driver.findElement(By.id("create_account_error"));
	if(actual.equals(exp)) {
		
	}
	return exp;
	}
	

	@Test
	public boolean verifymyaccount() throws Exception {
		
		try {
			 driver.findElement(By.xpath("//ul[@class='list-unstyled']//li//a[contains(text(),account')]")).click();
			 driver.findElement(By.xpath("/html/body/header/div/div/nav/div/ul/li[2]/a")).click();
//				click on mug
				driver.findElement(By.xpath("/html/body/div/div/aside/section[3]/div/div/ul/li[1]/article/div/span/a"));   
				
		} catch(NoSuchElementException e) {
			System.out.println(" handledexception");
		}
		ArrayList<String> actualMenus = new ArrayList<String>();
		
		
		List<WebElement> actmenus=driver.findElements(By.tagName("//td")); 
		for(WebElement element : actmenus) {
			actualMenus.add(element.getText());
		}
		Collections.sort(actualMenus);
		ArrayList<String> expectedMenu = ExcelUtility.getExcelTableData("thirtybees.xlsx","datasheet");
		if(actmenus.equals(expectedMenu)) {
		return true;
	
	}else {
		return false;
	}



	}
	@Test
	public String verifysignin() {
		WebElement signin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signin.click();
		WebElement element=driver.findElement(By.xpath("//div/input[@id='email_create']"));
		SelectUtil.selectByText(element,"mn@gmail.com");
	driver.findElement(By.xpath("//i[@class='icon icon-user-plus']")).click();
	driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
	WebElement radio1=driver.findElement(By.xpath("/html/body/div/div/main/div/form/div[1]/div[1]/div/label[2]/span"));
	radio1.click();
	WebElement firstname=driver.findElement(By.className("required form-group form-ok"));
	ActionUtility.enterFirstName(firstname,"priya");
	WebElement lastname=driver.findElement(By.className("//input[@onkeyup='$('#lastname').val(this.value);']"));
	ActionUtility.enterFirstName(firstname,"priya");
	driver.findElement(By.xpath("//input[@value='mm@gmail.com']"));
	WebElement password=driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
	password.sendKeys("abcop");
	WebElement day=driver.findElement(By.id("days"));
   SelectUtil.selectByIndex(day,9);
   WebElement month=driver.findElement(By.id("months"));
   
String August = null;
SelectUtil.selectByText(month,August);
   WebElement year=driver.findElement(By.id("years"));
   SelectUtil.selectByIndex(day,1994);
   driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
   String exp="Your account has been created.";
 WebElement actelement=driver.findElement(By.className("alert alert-success"));
   if (actelement.equals(exp)) {
	}
return exp;
	
	
	}
}



