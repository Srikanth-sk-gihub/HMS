package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	@FindBy(xpath = "//span[text()='Appointment']")
	private WebElement appoitment;
	@FindBy(xpath = "//span[text()='Appointment List']")
	private WebElement appointmentDropdown;
	@FindBy(xpath = "//span[text()='Bed Allotment']")
	private WebElement bedAllotmentLink;
	@FindBy(xpath ="//span[text()='Report']")
	private WebElement reportLink;
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement logoutLink;
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
   
    public void setAppoitment()
    {
    	appoitment.click();
    }
    public void setAppoitmentDropDown()
    {
     appointmentDropdown.click();
    }
    public void setBedAllotmentLink()
    {
    	bedAllotmentLink.click();
    }
    public void setReportLink()
    {
    	reportLink.click();
    }
    public void setLogoutLink()
    {
    	logoutLink.click();
    }
}
