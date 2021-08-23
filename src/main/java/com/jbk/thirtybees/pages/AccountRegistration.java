package com.jbk.thirtybees.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountRegistration {
	WebDriver driver;
	@Test
	@BeforeMethod 
	public void setup() {
		WebDriver driver;
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
 driver = new ChromeDriver();
driver.get("http://javabykiran.in/Other/thbees/");
// maximize window
		driver.manage().window().maximize();
	}
	
	@Test
		  public void verifymyaccount() {
			 driver.findElement(By.xpath("(//a[@title='Manage my customer account'])")).click();
			 driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
			 driver.findElement(By.xpath("//input[ @name='email_create'and @data-validate='isEmail']")).sendKeys("priyanka@gmail.com");
			driver.findElement(By.xpath("/html/body/div/div/main/div/div[1]/form/div/div[3]/button")).click();
			driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
	String actual=	driver.findElement(By.xpath("//h1")).getText();
			String exptitle="CREATE AN ACCOUNT";
		 
			Assert.assertEquals( actual,exptitle);
		 }
	@Test
	public void ChecktMyaccountMenu() {
		 
	 	ArrayList<String> expectedMenu = new ArrayList<String>();
	 	ArrayList<String> actualMenus = new ArrayList<String>();
	 	expectedMenu.add("My account");
	 	expectedMenu.add("My orders");
	 	expectedMenu.add("My credit slips");
	 	expectedMenu.add("My addresses");
	 	expectedMenu.add("My personal info");
	 		List<WebElement> actmenus=driver.findElements(By.id("blockmyaccountfooter")); //5 element
	 		for(WebElement element : actmenus) {
	 			actualMenus.add(element.getText());
	 			Assert.assertEquals(actmenus,expectedMenu);	
	 		}
	 	}

		
		@Test
		
		public void verifyregister() throws Exception {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://javabykiran.in/Other/thbees/");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("(//a[@title='Manage my customer account'])")).click();
					 driver.get("http://javabykiran.in/Other/thbees/login?back=my-account");
					 driver.findElement(By.xpath("//input[ @name='email_create'and @data-validate='isEmail']")).sendKeys("pp@gmail.com");
					driver.findElement(By.xpath("/html/body/div/div/main/div/div[1]/form/div/div[3]/button")).click();
					driver.get("http://javabykiran.in/Other/thbees/login?back=my-account#");
//					driver.findElement(By.xpath("//label[2]/span"));
//					Radio button
					WebElement Female=driver.findElement(By.xpath("//*[@id='account-creation_form']/div[1]/div[1]/div/label[2]"));
					Female.click();
					driver.findElement(By.xpath("//input[@onkeyup='$('#firstname').val(this.value);']")).sendKeys("priya");
					driver.findElement(By.xpath("//input[@onkeyup='$('#lastname').val(this.value);']")).sendKeys("bbb");
					driver.findElement(By.xpath("//input[@data-validate='isEmail']")).sendKeys("pp@gmail.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("33@ab");
					Select day = new Select(driver.findElement(By.id("days")));
					day.selectByVisibleText("27");
					Select month = new Select(driver.findElement(By.id("months")));
					month.selectByVisibleText("Aug");
					Select year = new Select(driver.findElement(By.id("years")));
					year.selectByVisibleText("2000");
					Thread.sleep(5000);
				WebElement ch1=driver.findElement(By.xpath("/html/body/div/div/main/div/form/div[1]/div[7]/label/span/text()"));
		               ch1.click();
		               WebElement ch2=driver.findElement(By.xpath("/html/body/div/div/main/div/form/div[1]/div[8]/label/span"));
		               ch2.click();   
		               driver.findElement(By.id("/html/body/div/div/main/div/form/div[1]/div[7]/label/span/text()"));  
	
		}   
}
	
