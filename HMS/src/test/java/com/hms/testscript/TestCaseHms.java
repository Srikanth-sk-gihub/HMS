package com.hms.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hms.generic.BaseClass;
import com.hms.pom.CreateDoctorModule;
import com.hms.pom.HomePage;
@Listeners(com.hms.generic.ListinerImplementation.class)
public class TestCaseHms extends BaseClass
{
	@Test
	public void createProject() throws InterruptedException, EncryptedDocumentException, IOException
	{Thread.sleep(2000);
		HomePage h=new HomePage(driver);Thread.sleep(2000);
		String doctorModuleSheet=fl.readExcel("DoctorModule", 1, 2);
		h.setAppoitment();Thread.sleep(2000);
		h.setAppoitmentDropDown();Thread.sleep(2000);
		CreateDoctorModule cd=new CreateDoctorModule(driver);Thread.sleep(2000);
		cd.getAddAppoitmentBtn().click();Thread.sleep(2000);
		cd.getDateDrop().click();Thread.sleep(2000);
		cd.getSelectMonth().click();Thread.sleep(2000);
		cd.getSelectDay().click();Thread.sleep(2000);
		cd.getSelectDropdown().click();Thread.sleep(2000);
		cd.getSelectTime().click();Thread.sleep(2000);
		cd.getSelectPatient().click();Thread.sleep(2000);
		cd.getSearch().sendKeys(doctorModuleSheet);Thread.sleep(2000);
		cd.getSelectName().click();Thread.sleep(2000);
//		cd.getNotifyCheckBox().click();Thread.sleep(2000);
		cd.getSubmittBtn().click();Thread.sleep(2000);
//	   String message=cd.getMsgLink().getText();Thread.sleep(2000);
//	   Assert.
		cd.setMsgLink("Appointment Info Saved Successfuly");Thread.sleep(2000);
	}

}
