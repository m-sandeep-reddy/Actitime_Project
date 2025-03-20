
package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.generic.File_Lib;
import com.actitime.pom.Home_Page;
import com.actitime.pom.Tasks_Page;

@Listeners(com.actitime.generic.Listener_Implementation.class)
public class Customer_Module extends Base_Class {
	
	@Test(invocationCount = 1 , priority = 1)
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Customer",true);
		
		Home_Page h = new Home_Page(driver);
		h.setTask();
		
		File_Lib f = new File_Lib();
		String actCustomerNmae = f.getExcel("createCustomer", 4, 6);
		
		Tasks_Page t = new Tasks_Page(driver);
		
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();		
		t.getEnterCustoemrNameTf().sendKeys("HDFC_001");		
		t.getAddCustoemrDescriptionTf().sendKeys("Banking Project");		
		t.getImportListBox().click();		
		t.getOurCompanyOption().click();		
		t.getCreateCustomerBtn().click();
		Thread.sleep(2000);
		
		String expCustomerName = t.getExpCustomerName().getText();
		Assert.assertEquals(expCustomerName , actCustomerNmae);
		}
	
	@Test(invocationCount = 1 , priority = 3 , dependsOnMethods = "com.actitime.testscript.Project_Module.testDeleteProject")
	public void testDeleteCustomer() throws InterruptedException
	{
		Reporter.log("Delete Customer",true);
		
		Home_Page h = new Home_Page(driver);
		h.setTask();
		
		Tasks_Page t = new Tasks_Page(driver);
				
		Actions a = new Actions(driver);
		a.moveToElement(t.getHdfcSettingsBtn()).click().perform();
		Thread.sleep(1000);
		t.getHdfcActionsBtn().click();
		t.getHdfcDeleteBtn().click();
		t.getHdfcDeletePermanentBtn().click();
		Thread.sleep(2000);
		
	}
	
	@Test(invocationCount = 1 , priority = 2)
	public void testModifyCustomerStatus() throws InterruptedException
	{
		Reporter.log("Modify Customer Status",true);
		
		Home_Page h = new Home_Page(driver);
		h.setTask();
		
		Tasks_Page t = new Tasks_Page(driver);
		
		t.getAllCustomersLink().click();
		t.getStatusDropDown().click();
		t.getOpenTasksBtn().click();;
		t.getAllCustomersCheckBox().click();
		t.getChangeStatusOption().click();
		t.getChangeStatusToCompleted().click();
		Thread.sleep(2000);
		
	}

	
}
