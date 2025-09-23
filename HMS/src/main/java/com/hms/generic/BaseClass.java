package com.hms.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	public void OpenBrowser()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://106.51.75.38:9017/");
	}
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("doctor@doc.com");
		driver.findElement(By.id("password")).sendKeys("Rekha@098");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public void Logout()
	{
		driver.findElement(By.linkText("=\"http://106.51.75.38:9017/index.php?login/logout\"")).click();
	}
	public void close()
	{
		driver.quit();
	}
	
}
