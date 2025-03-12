package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.pom.Home_Page;
import com.actitime.pom.Reports_Page;
@Listeners(com.actitime.generic.Listener_Implementation.class)
public class Reports_Module extends Base_Class{
	
	@Test
	public void testCreateReport() throws InterruptedException
	{
		Reporter.log("Create Report",true);
		
		Home_Page h = new Home_Page(driver);
		h.getReportsTab().click();
		
		Reports_Page r = new Reports_Page(driver);
		r.getAddNewReportButton().click();
		Thread.sleep(1000);
		r.getAddStaffReportButton().click();
		Thread.sleep(1000);
		r.getGenerateHtmlReportButton().click();;
		Thread.sleep(1000);
		
	}
	

}
