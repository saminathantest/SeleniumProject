package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePageACME extends SeleniumBase{
	
	public HomePageACME moveToElement() {
		WebElement invoice = driver.findElementByXPath("(//div[@class='dropdown']//button)[6]");
		Actions builder = new Actions(driver);
		builder.moveToElement(invoice).perform();
		return this;
	}
	

	

}
