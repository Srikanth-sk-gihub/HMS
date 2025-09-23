package com.hms.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hms.generic.BaseClass;
import com.hms.pom.CreateDoctorModule;
import com.hms.pom.HomePage;
@Listeners(com.hms.generic.ListnerImpelementaion.class)
public class TestCaseHms extends BaseClass
{
	@Test
	public void createProject()
	{
		HomePage h=new HomePage(driver);
		h.setAppointmentDropdown();
		h.setAppoitment();
		CreateDoctorModule cd=new CreateDoctorModule(driver);
		cd.getAddAppoitmentBtn().click();
		cd.getDateDrop().click();
		cd.getSelectYaer().click();
		cd.getSelectMonth().click();
		cd.getSelectDay().click();
		cd.getSelectDropdown().click();
		cd.getSelectTime().click();
		cd.getSelectPatient().click();
		cd.getSearch().sendKeys("soni");
		cd.getNotifyCheckBox().click();
		cd.getSubmittBtn().click();
	}

}
