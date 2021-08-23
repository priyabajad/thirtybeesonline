package com.jbk.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.thirtybees.pages.Footerpage;
import com.thirtybees.base.TestBase;

public class FooterpageTest extends TestBase {
	WebDriver driver;
	public Footerpage Fp;

	@BeforeMethod
	public void setup() throws Exception {
		driver = initialization("config.properties");
		Fp = new Footerpage(driver);
	}

	@Test
	public void checksubscription() {
		Assert.assertEquals(Fp.verifysubscription(), "Newsletter : This email address is already registered.");
	}

	@Test
	public void checkoutfollowfacebook() {
		Assert.assertEquals(Fp.Verifyfollowfacebook(), "https://www.facebook.com/thirtybees");
	}

	@Test
	public void verifycreditslip() {
		Assert.assertEquals(Fp.verifyaddtocart(), " Product successfully added to your shopping cart");
	}

	@Test
	public void verifysearchbutton() {
		Assert.assertEquals(Fp.verifysearchbutton(), "Search-BEE");
	}
	@Test
	public void verifytMyaccountMenu() {
		Assert.assertFalse(Fp.verifytMyaccountMenu());
	}
	
}
