package com.jbk.thirtybees.test;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.thirtybees.pages.Footerpage;
import com.jbk.thirtybees.pages.Myaccount;
import com.thirtybees.base.TestBase;

public class MyaccountTest extends TestBase{	
	WebDriver driver;
	public Myaccount ac;
	public Footerpage Fp;

	@BeforeMethod
	public void setup() throws Exception  {
		driver = initialization("config.properties");
		ac = new Myaccount(driver);
	}

	

	@Test
	public void verifycreateaccount() {
		Assert.assertEquals(ac.verifycreateaccount(),"An account using this email address has already been registered. Please enter a valid password or request a new one.");
	}
	@Test
	public void verifymyaccount() throws Exception {
		Assert.assertFalse(ac.verifymyaccount());
		
	}
	@Test
	public void  verifysignin() {
		Assert.assertEquals(ac.verifysignin(),"Your account has been created.");
	}
}

	