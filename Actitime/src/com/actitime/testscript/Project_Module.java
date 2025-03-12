package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.generic.File_Lib;
import com.actitime.pom.Home_Page;
import com.actitime.pom.Tasks_Page;
@Listeners(com.actitime.generic.Listener_Implementation.class)
public class Project_Module extends Base_Class{
	
	/*@Test
	public void testCreateProject()
	{
		Reporter.log("crate Project",true);
	}
	
	@Test
	public void testModifyProject()
	{
		Reporter.log("Modify project",true);
	}
	
	@Test
	public void testDelteProject()
	{
		Reporter.log("delete project",true);
	}*/
	
	@Test(invocationCount = 1 ,priority = 1)
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create Project",true);
		Home_Page h = new Home_Page(driver);
		h.setTask();
		
		File_Lib f = new File_Lib();
		String actProjectName = f.getExcel("CreateProject", 1, 6);
		String projectDescription = f.getExcel("CreateProject", 1, 7);
		
		Tasks_Page t = new Tasks_Page(driver);
		
		t.getAddNewBtn().click();
		t.getNewProjectBtn().click();
		t.getEnterProjectNameTf().sendKeys(actProjectName);
		t.getCustomerListBox().click();
		t.getProjectOption().click();
		t.getAddProjectDescriptionTf().sendKeys(projectDescription);
		t.getCreateProjectBtn().click();
		String expProjectName = t.getExpProjectName().getText();
		Assert.assertEquals(expProjectName , actProjectName);
	}
	
	@Test(invocationCount = 0 , priority = 2)
	public void testDeleteProject() throws InterruptedException
	{
		Reporter.log("Delete Project",true);
		
		Home_Page h = new Home_Page(driver);
		h.setTask();
		
		Tasks_Page t = new Tasks_Page(driver);
				
		Actions a = new Actions(driver);
		a.moveToElement(t.getHdfcProjectSettingsBtn()).click().perform();
		Thread.sleep(1000);
		t.getBankingProjectActionsBtn().click();
		t.getBankingProjectDeleteBtn().click();
		t.getBankingDeletePermanentBtn().click();
		//Thread.sleep(2000);
		
	}


}
