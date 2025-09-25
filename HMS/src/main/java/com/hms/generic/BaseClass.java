package com.hms.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.hms.pom.HomePage;
import com.hms.pom.LoginPage;

public class BaseClass 
{
	public static WebDriver driver;
	public static FileLib fl=new FileLib();
	@BeforeTest
	public void OpenBrowser() throws IOException
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url=fl.readProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		String un=fl.readProperty("un");
		String pwd=fl.readProperty("pwd");
		lp.setLogin(un, pwd);
	}
	@AfterMethod
	public void Logout()
	{
		HomePage hp=new HomePage(driver);
		hp.setLogoutLink();
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}
