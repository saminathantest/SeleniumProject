package com.leafBot.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	  //https://acme-test.uipath.com/account/login
	  //http://leaftaps.com/opentaps
	startApp("chrome", "https://acme-test.uipath.com/account/login");
	node = test.createNode(testcaseName);
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}
