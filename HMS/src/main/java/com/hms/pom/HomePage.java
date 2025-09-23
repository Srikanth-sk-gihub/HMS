package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "(//i[@class='entypo-menu'])[1]")
	private WebElement dashBoard;
	@FindBy(xpath = "//span[text()='Appointment']")
	private WebElement appoitment;
	@FindBy(xpath = "//span[text()='Appointment List']")
	private WebElement appointmentDropdown;
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement loutLink;
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void setDashBoard()
    {
    	dashBoard.click();
    }
    public void setAppoitment()
    {
    	appoitment.clear();
    }
    public void setAppointmentDropdown()
    {
    	appointmentDropdown.click();
    }
}
