package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pageObject.loginPOM;

public class Test_001 extends BaseClass{
	
	@Test
	public void verifyLoginPage() {
	
	
	
	//identify webelement
	loginPOM login = PageFactory.initElements(driver, loginPOM.class);
	
	
	//actions
	Library.custom_SendKeys(login.gettxt_email(),xl.getStringData("Sheet1",0,0));
	Library.custom_SendKeys(login.getpass(), xl.getStringData("Sheet1", 0, 1));
	
	}

}
