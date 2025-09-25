package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "email")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement paswd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginLink;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pwd)
	{
		userName.sendKeys(un);
		paswd.sendKeys(pwd);
		loginLink.click();
	}

}
