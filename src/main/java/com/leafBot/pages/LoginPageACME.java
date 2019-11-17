package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LoginPageACME extends SeleniumBase{
	
		
	public LoginPageACME enterUsername(String username) {
		clearAndType(locateElement("email", "kumar.testleaf@gmail.com"), username);
		return this;
	}
	
	public LoginPageACME enterPassword(String password) {
		clearAndType(locateElement("password", "leaf@12"), password);
		return this;
	}
	
	public HomePageACME clickLogin() {
		click(locateElement("id","buttonLogin"));
		return new HomePageACME();
	}
	
	

}
