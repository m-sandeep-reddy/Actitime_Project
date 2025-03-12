package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.hssf.usermodel.CreateDateCells;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.generic.File_Lib;
import com.actitime.pom.Home_Page;
import com.actitime.pom.Users_Page;
@Listeners(com.actitime.generic.Listener_Implementation.class)
public class Users_Module extends Base_Class{
	
	@Test(invocationCount = 1,priority = 1)
	public void testCreateUser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create User",true);
		Home_Page h = new Home_Page(driver);
		h.setUserTab();
		
		Users_Page u = new Users_Page(driver);
		
		File_Lib f = new File_Lib();
		String firstName = f.getExcel("CreateUser", 2, 1);
		String lastName = f.getExcel("CreateUser", 2, 2);
		String maidId = f.getExcel("CreateUser", 2, 3);
		String userName = f.getExcel("CreateUser", 3, 1);
		String password = f.getExcel("CreateUser", 3, 2);
		String confirPpassword = f.getExcel("CreateUser", 3, 2);
		
		u.getAddUserBtn().click();
		u.getFirstNameTf().sendKeys(firstName);
		u.getLastNameTf().sendKeys(lastName);
		u.getMailIdTf().sendKeys(maidId);
		u.getUserNameTf().sendKeys(userName);
		u.getPasswordTf().sendKeys(password);
		u.getConfPasswordTf().sendKeys(confirPpassword);
		u.getCreateUserBtn().click();
	}
	
	@Test(invocationCount = 1 , priority = 2)
	public void testModifyUser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create User",true);
		Home_Page h = new Home_Page(driver);
		h.setUserTab();
		
		Users_Page u = new Users_Page(driver);
		
		File_Lib f = new File_Lib();
		String firstName = f.getExcel("CreateUser", 5, 1);
		String lastName = f.getExcel("CreateUser", 5, 2);
		String maidId = f.getExcel("CreateUser", 5, 3);
		String userName = f.getExcel("CreateUser", 6, 1);
		String password = f.getExcel("CreateUser", 6, 2);
		String confirPpassword = f.getExcel("CreateUser", 6, 2);
		
		u.getSandeepUserDetails().click();
		u.getFirstNameTf().sendKeys(Keys.CONTROL+"A");
		u.getFirstNameTf().sendKeys(firstName);
		u.getLastNameTf().sendKeys(Keys.CONTROL+"A");
		u.getLastNameTf().sendKeys(lastName);
		u.getMailIdTf().sendKeys(Keys.CONTROL+"A");
		u.getMailIdTf().sendKeys(maidId);
		u.getUserNameTf().sendKeys(Keys.CONTROL+"A");
		u.getUserNameTf().sendKeys(userName);
		u.getPasswordTf().sendKeys(Keys.CONTROL+"A");
		u.getPasswordTf().sendKeys(password);
		u.getConfPasswordTf().sendKeys(Keys.CONTROL+"A");
		u.getConfPasswordTf().sendKeys(confirPpassword);
		u.getUserSaveChangesBtn().click();
	}
	
	@Test(invocationCount = 1 ,priority = 3)
	public void testDeleteUser() throws InterruptedException
	{
		Reporter.log("Delete User",true);
		Home_Page h = new Home_Page(driver);
		h.setUserTab();
		
		Users_Page u = new Users_Page(driver);
		
		u.getKabirUserDetails().click();
		Thread.sleep(1000);
		u.getDeleteUserBtn().click();
		driver.switchTo().alert();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
