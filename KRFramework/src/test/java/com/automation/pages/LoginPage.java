package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="username") WebElement pass;
		
	@FindBy(xpath="//input[@value='login']") WebElement loginbutton;
	
	public void loginToCRM(String usernameApp,String passwordApp) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginbutton.click();
		
	}

	
}
