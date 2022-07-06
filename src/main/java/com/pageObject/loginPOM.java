package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPOM {
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	private WebElement txt_email;

	@FindBy(how=How.XPATH, using="//input[@id='pass']")
	private WebElement pass;
	
	public WebElement gettxt_email() {
		return txt_email;
	}
	
	public WebElement getpass() {
		return pass;
	}

}
