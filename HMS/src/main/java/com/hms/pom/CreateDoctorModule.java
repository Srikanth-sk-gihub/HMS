package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CreateDoctorModule 
{
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement addAppoitmentBtn;
	@FindBy(name = "date_timestamp")
	private WebElement dateDrop;
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	private WebElement selectMonth;
	@FindBy(xpath = "//td[@class='active day']")
	private WebElement selectDay;
	@FindBy(name = "time_timestamp")
	private WebElement selectDropdown;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement selectTime;
	@FindBy(xpath = "//span[text()='Select Patient']")
	private WebElement selectPatient;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement search;
	@FindBy(xpath = "//span[text()='soni']")
	private WebElement selectName;
	
	@FindBy(xpath = "//input[@class='btn btn-success']")
	private WebElement submittBtn;
	@FindBy(xpath = "//div[@class='toast-message']")
	private WebElement msgLink;
	public CreateDoctorModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getSelectName() {
		return selectName;
	}

	public WebElement getAddAppoitmentBtn() {
		return addAppoitmentBtn;
	}
	public WebElement getDateDrop() {
		return dateDrop;
	}
	
	public WebElement getSelectMonth() {
		return selectMonth;
	}
	public WebElement getSelectDay() {
		return selectDay;
	}
	public WebElement getSelectDropdown() {
		return selectDropdown;
	}
	public WebElement getSelectTime() {
		return selectTime;
	}
	public WebElement getSelectPatient() {
		return selectPatient;
	}
	public WebElement getSearch() {
		return search;
	}
//	public WebElement getNotifyCheckBox() {
//		return notifyCheckBox;
//	}
	public WebElement getSubmittBtn() {
		return submittBtn;
	}
	
	public void setMsgLink(String expected) {
		 String succMsg=msgLink.getText();
		 Reporter.log(succMsg,true);
		 
		 Assert.assertEquals(succMsg, expected,"Appointment Info Not Save Succeefull");
	}
	

}
