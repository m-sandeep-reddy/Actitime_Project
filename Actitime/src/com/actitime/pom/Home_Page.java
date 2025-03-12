package com.actitime.pom;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(id = "logoutLink")
	private WebElement logOut;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskTab;
	
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement usersTab;
	
	@FindBy(xpath = "//div[@class='popup_menu_icon settings_icon']")
	private WebElement settingsBtn;
	
	@FindBy(xpath = "//a[text()='Logo & Color Scheme']")
	private WebElement logoAndColuorLink;
	
	@FindBy(id = "purple")
	private WebElement purpleColourOption;
	
	@FindBy(xpath = "//input[@value='Save Settings']")
	private WebElement colurSaveSettingsBtn;
	
	@FindBy(xpath = "//div[text()='TIME-TRACK']")
	private WebElement timeTrackTab;
	
	@FindBy(xpath = "//div[text()='REPORTS']")
	private WebElement reportsTab;
	
	public WebElement getTimeTrackTab() {
		return timeTrackTab;
	}

	public WebElement getReportsTab() {
		return reportsTab;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getTaskTab() {
		return taskTab;
	}

	public WebElement getUsersTab() {
		return usersTab;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getLogoAndColuorLink() {
		return logoAndColuorLink;
	}

	public WebElement getPurpleColourOption() {
		return purpleColourOption;
	}

	public WebElement getColurSaveSettingsBtn() {
		return colurSaveSettingsBtn;
	}

	public void setUserTab() {
		usersTab.click();
	}

	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout()
	{
		logOut.click();
	}
	
	public void setTask()
	{
		taskTab.click();
	}
	

}
