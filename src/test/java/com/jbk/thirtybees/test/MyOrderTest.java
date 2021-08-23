package com.jbk.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.jbk.thirtybees.pages.Footerpage;

public class MyOrderTest {
	WebDriver driver;
	public Myaccountpage mp;

	@BeforeMethod
	public void setup() throws Exception {
		driver = initialization("config.properties");
	mp = new Myaccountpage(driver);
	}

	private WebDriver initialization(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
