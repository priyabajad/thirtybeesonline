package com.jbk.thirtybees.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thirtybees.objectRepository.FooterpageObjectRepository;

public class Footerpage extends FooterpageObjectRepository {
	WebDriver driver;
	public Footerpage(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver, this);
		}


	public String verifysubscription() {
		newsletter.sendKeys("priyanka@gmail.com");
	button.click();
		String exptext="Newsletter : This email address is already registered.";
	actualtext.getText();
		if(actualtext.equals(exptext)) {
		
		}
		return exptext;	
}
	
	
	public String Verifyfollowfacebook() {       		
		driver.navigate().to("https://www.facebook.com/thirtybees");
		driver.getTitle();
		String exp="https://www.facebook.com/thirtybees";
		String actual=driver.getTitle();
		if(actual.equals(exp)) {
		}
		return exp;
	}
	
	
	
	
	
	public String verifyaddtocart() {
		
		Myorder.click();
	driver.get("http://javabykiran.in/Other/thbees/login?back=order-slip");
	teaandcofee.click();
	driver.get("http://javabykiran.in/Other/thbees/coffee-and-tea");
    mug.click();
addcart.click();
actualdata.getText();
String expected=" Product successfully added to your shopping cart";
  if(actualdata.equals(expected)) {
	  
  }
return expected;

	}
	
	public boolean verifytMyaccountMenu() {
		 
	 	ArrayList<String> expectedMenu = new ArrayList<String>();
	 	ArrayList<String> actualMenus = new ArrayList<String>();
	 	expectedMenu.add("My account");
	 	expectedMenu.add("My orders");
	 	expectedMenu.add("My credit slips");
	 	expectedMenu.add("My addresses");
	 	expectedMenu.add("My personal info");
	 		for(WebElement element : actmenus) {
	 			actualMenus.add(element.getText());
	 			if(actmenus.equals(expectedMenu)) {
	 				return true;
	 			}
	 			else {
	 			}
	 		}
			return false;
	 	}

	 	

//	}
	@Test
	public String verifysearchbutton() {
	driver.findElement(By.xpath("//*[@id='blockmyaccountfooter']/ul/li[1]/a")).click();
	WebElement box=driver.findElement(By.id("search_query_top"));
	box.sendKeys("cofee");
	driver.findElement(By.xpath("//i[@class='icon icon-search']")).click();
	driver.get("http://javabykiran.in/Other/thbees/search?controller=search&orderby=position&orderway=desc&search_query=coffee&submit_search=");
     String actual=driver.getTitle();
	String exp="Search-BEE";
	if(actual.equals(exp)){
	}
	return exp;
	
	

	}
	@Test
	public String verifycheckoutprocess() {
		driver.findElement(By.className("ajax_cart_quantity")).click();
		driver.navigate().to("http://javabykiran.in/Other/thbees/order");
		driver.findElement(By.className("btn btn-lg btn-success pull-right standard-checkout btn-full")).click();
		driver.get("http://javabykiran.in/Other/thbees/login?back=http%3A%2F%2Fjavabykiran.in%2FOther%2Fthbees%2Forder%3Fstep%3D1");
		String act=driver.getTitle();
	String exp="http://javabykiran.in/Other/thbees/login?back=http%3A%2F%2Fjavabykiran.in%2FOther%2Fthbees%2Forder%3Fstep%3D1";
	if(act.equalsIgnoreCase(exp)) {
		
	}
	return exp;
	
	
	}
	
}


