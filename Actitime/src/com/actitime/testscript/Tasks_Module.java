package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.generic.File_Lib;
import com.actitime.generic.Listener_Implementation;
import com.actitime.pom.Home_Page;
import com.actitime.pom.Time_Track_Page;

@Listeners(com.actitime.generic.Listener_Implementation.class)
public class Tasks_Module extends Base_Class{
	
	@Test(invocationCount = 1 , priority = 1 , dependsOnMethods = {"com.actitime.testscript.Customer_Module.testCreateCustomer","com.actitime.testscript.Project_Module.testCreateProject"})
	public void testCreateTasks() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create Tasks",true);
		
		Home_Page h = new Home_Page(driver);
		h.getTimeTrackTab().click();
		
		File_Lib f = new File_Lib();
		String task1Name = f.getExcel("CreateTasks", 3, 1);
		String task2Name = f.getExcel("CreateTasks", 3, 2);
		String task3Name = f.getExcel("CreateTasks", 3, 3);
		
		Time_Track_Page t = new Time_Track_Page(driver);
		t.getAddNewTaskBtn().click();
		Thread.sleep(1000);
		t.getSelectCustomerDropDown().click();
		t.getHdfcCustomerOption().click();
		t.getSelectProjectDropDown().click();
		t.getBankingProjectOption().click();
		
		t.getTask1Tf().sendKeys(task1Name);
		t.getTask1SetDeadLineCalender().click();
		t.getTask1DeadLineIs().click();
		t.getTask1TypeOfWorkBtn().click();
		t.getTask1WorkTypeIs().click();
		
		/*t.getTask2Tf().sendKeys(task2Name);
		t.getTask2SetDeadLineCalender().click();
		Thread.sleep(1000);
		t.getTask2DeadLineIs().click();
		Thread.sleep(1000);
		t.getTask2TypeOfWorkBtn().click();
		Thread.sleep(1000);
		t.getTask2WorkTypeIs().click();
		
		t.getTask3Tf().sendKeys(task3Name);
		t.getTask3SetDeadLineCalender().click();
		t.getTask3DeadLineIs().click();
		t.getTask3TypeOfWorkbtn().click();
		t.getTask3WorkTypeIs().click();
		*/
		
		t.getCreateTasksButton().click();
		Thread.sleep(2000);
	}
	
	@Test(invocationCount = 1 , priority = 2 , dependsOnMethods = "testCreateTasks")
	public void testDeleteTasks() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("delete Tasks",true);
		
		Home_Page h = new Home_Page(driver);
		h.getTimeTrackTab().click();
		
		Time_Track_Page t = new Time_Track_Page(driver);
		t.getOpenAccountTask().click();
		Thread.sleep(1000);
		t.getOpenAccountDeleteBtn().click();
		t.getOpenAccountPermanentDeleteBtn().click();
		Thread.sleep(2000);
		
	}

}
