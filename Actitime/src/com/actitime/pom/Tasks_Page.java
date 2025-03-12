package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks_Page {
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	
	@FindBy(id = "customerLightBox_nameField")
	private WebElement enterCustoemrNameTf;
	
	@FindBy(id = "projectPopup_projectNameField")
	private WebElement enterProjectNameTf;
	
	@FindBy(xpath = "//button[text()= '-- Select an active customer to import information from --']")
	private WebElement importListBox;
	
	@FindBy(xpath = "//button[text()= '-- Please Select Customer to Add Project for  --']")
	private WebElement customerListBox;
	
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement addCustoemrDescriptionTf;
	
	@FindBy(id = "projectPopup_projectDescriptionField")
	private WebElement addProjectDescriptionTf;

	@FindBy(xpath = "//a[text()='Our Company']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath = "//a[text()='HDFC_001']")
	private WebElement projectOption;
	
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath = "//span[@class='nonClickable']/../../../div/div[text()='HDFC_001']")
	private WebElement expCustomerName;
	
	@FindBy(xpath = "//div[@class='navigationLinks']/../div[text()='Banking Project']")
	private WebElement expProjectName;
	
	@FindBy(xpath = "//div[text()='HDFC_001 ']/..//div[@class='editButton available']")
	private WebElement hdfcSettingsBtn;
	
	@FindBy(xpath = "//div[text()='Banking Project ']/..//div[@class='editButton available']")
	private WebElement hdfcProjectSettingsBtn;
	
	@FindBy(xpath = "//div[text()='All Customers']")
	private WebElement allCustomersLink;
	
	@FindBy(xpath = "//div[@class='checkbox inactive']")
	private WebElement allCustomersCheckBox;
	
	@FindBy(xpath = "//div[text()='Completed tasks']")
	private WebElement completedTasksBtn;

	@FindBy(xpath = "//div[text()='Open tasks']")
	private WebElement openTasksBtn;
	
	@FindBy(xpath = "//div[@class='statusFilterButton']")
	private WebElement statusDropDown;
	
	@FindBy(xpath = "//span[text()='Change Status']")
	private WebElement changeStatusOption;
	
	@FindBy(xpath = "//div[text()='Completed']")
	private WebElement changeStatusToCompleted;

	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement hdfcActionsBtn;
	
	@FindBy(xpath = "(//div[text()='ACTIONS'])[3]")
	private WebElement bankingProjectActionsBtn;
	
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement hdfcDeleteBtn;
	
	@FindBy(xpath = "(//div[text()='Delete'])[3]")
	private WebElement bankingProjectDeleteBtn;
	
	@FindBy(id = "customerPanel_deleteConfirm_submitTitle")
	private WebElement hdfcDeletePermanentBtn;
	
	@FindBy(id = "projectPanel_deleteConfirm_submitTitle")
	private WebElement bankingDeletePermanentBtn;
	
	public WebElement getHdfcActionsBtn() {
		return hdfcActionsBtn;
	}

	public WebElement getBankingProjectActionsBtn() {
		return bankingProjectActionsBtn;
	}

	public WebElement getHdfcDeleteBtn() {
		return hdfcDeleteBtn;
	}

	public WebElement getBankingProjectDeleteBtn() {
		return bankingProjectDeleteBtn;
	}
	
	public WebElement getHdfcDeletePermanentBtn() {
		return hdfcDeletePermanentBtn;
	}

	public WebElement getBankingDeletePermanentBtn() {
		return bankingDeletePermanentBtn;
	}

	public WebElement getAllCustomersLink() {
		return allCustomersLink;
	}

	public WebElement getAllCustomersCheckBox() {
		return allCustomersCheckBox;
	}

	public WebElement getChangeStatusOption() {
		return changeStatusOption;
	}

	public WebElement getChangeStatusToCompleted() {
		return changeStatusToCompleted;
	}

	public WebElement getHdfcProjectSettingsBtn() {
		return hdfcProjectSettingsBtn;
	}
	
	public WebElement getCompletedTasksBtn() {
		return completedTasksBtn;
	}

	public WebElement getOpenTasksBtn() {
		return openTasksBtn;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}
	
	public WebElement getHdfcSettingsBtn() {
		return hdfcSettingsBtn;
	}

	public WebElement getExpProjectName() {
		return expProjectName;
	}

	public WebElement getProjectOption() {
		return projectOption;
	}

	public Tasks_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getEnterCustoemrNameTf() {
		return enterCustoemrNameTf;
	}

	public WebElement getEnterProjectNameTf() {
		return enterProjectNameTf;
	}

	public WebElement getImportListBox() {
		return importListBox;
	}

	public WebElement getCustomerListBox() {
		return customerListBox;
	}

	public WebElement getAddCustoemrDescriptionTf() {
		return addCustoemrDescriptionTf;
	}

	public WebElement getAddProjectDescriptionTf() {
		return addProjectDescriptionTf;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getExpCustomerName() {
		return expCustomerName;
	}
}
