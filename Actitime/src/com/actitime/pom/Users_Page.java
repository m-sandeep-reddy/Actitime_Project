package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_Page {
	
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement addUserBtn;
	
	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement firstNameTf;
	
	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lastNameTf;
	
	@FindBy(id = "userDataLightBox_emailField")
	private WebElement mailIdTf;
	
	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement userNameTf;
	
	@FindBy(id = "userDataLightBox_passwordField")
	private WebElement passwordTf;
	
	@FindBy(id = "userDataLightBox_passwordCopyField")
	private WebElement confPasswordTf;
	
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createUserBtn;
	
	@FindBy(xpath = "//span[text()='reddy, sandeep']")
	private WebElement sandeepUserDetails;
	
	@FindBy(xpath = "//span[text()='singh, kabir']")
	private WebElement kabirUserDetails;

	@FindBy(id = "userDataLightBox_deleteBtn")
	private WebElement deleteUserBtn;
	
	@FindBy(xpath = "//span[text()='Save Changes']")
	private WebElement userSaveChangesBtn;
	
	public WebElement getKabirUserDetails() {
		return kabirUserDetails;
	}
	
	public WebElement getUserSaveChangesBtn() {
		return userSaveChangesBtn;
	}

	public WebElement getDeleteUserBtn() {
		return deleteUserBtn;
	}

	public Users_Page(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getFirstNameTf() {
		return firstNameTf;
	}

	public WebElement getLastNameTf() {
		return lastNameTf;
	}

	public WebElement getMailIdTf() {
		return mailIdTf;
	}

	public WebElement getUserNameTf() {
		return userNameTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getConfPasswordTf() {
		return confPasswordTf;
	}

	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}

	public WebElement getSandeepUserDetails() {
		return sandeepUserDetails;
	}

}
