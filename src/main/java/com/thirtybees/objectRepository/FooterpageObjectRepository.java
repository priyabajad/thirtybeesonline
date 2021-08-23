package com.thirtybees.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterpageObjectRepository {
	@FindBy(xpath="/html/body/footer/div/div/section[1]/form")
	public WebElement newsletter;

		@FindBy (xpath="//button[@name='submitNewsletter']")
		public WebElement button;
		
		@FindBy(xpath="//div[@class='alert alert-danger']")
		public WebElement actualtext;

		@FindBy(xpath="//i[@class='icon icon-facebook icon-2x icon-fw']")
		public WebElement Element;

		@FindBy(xpath="//*[@id='blockmyaccountfooter']/ul/li[2]/a")
		public WebElement Myorder;
		
		@FindBy(xpath="//a[@title='Coffee and Tea']")
		public WebElement teaandcofee;
		
		@FindBy(xpath="//a[contains(text(),'Mug')]")
		public WebElement mug;
		
		@FindBy(xpath="//a[@data-id-product-attribute='18']")
		public WebElement addcart;
		
		@FindBy(id="header-blocks")
		public WebElement actualdata;
		
		@FindBy (className="list-unstyled")
		public List<WebElement> actmenus;
}
