package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDoctorModule 
{
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement addAppoitmentBtn;
	@FindBy(name = "date_timestamp")
	private WebElement dateDrop;
	@FindBy(xpath = "//th[text()='2025']")
	private WebElement selectYaer;
	@FindBy(xpath = "//span[@class='month active']")
	private WebElement selectMonth;
	@FindBy(xpath = "//td[@class='active day']")
	private WebElement selectDay;
	@FindBy(name = "time_timestamp")
	private WebElement selectDropdown;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement selectTime;
	@FindBy(xpath = "//span[text()='Select Patient']")
	private WebElement selectPatient;
	@FindBy(xpath = "//input[@class='select2-input']")
	private WebElement search;
	@FindBy(name = "notify")
	private WebElement notifyCheckBox;
	@FindBy(xpath = "//input[@class='btn btn-success']")
	private WebElement submittBtn;
	public CreateDoctorModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddAppoitmentBtn() {
		return addAppoitmentBtn;
	}
	public WebElement getDateDrop() {
		return dateDrop;
	}
	public WebElement getSelectYaer() {
		return selectYaer;
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
	public WebElement getNotifyCheckBox() {
		return notifyCheckBox;
	}
	public WebElement getSubmittBtn() {
		return submittBtn;
	}
	

}
