package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_Track_Page {
	
	@FindBy(xpath = "//span[@onclick='openAddNewTasksPopup();']")
	private WebElement addNewTaskBtn;
	
	@FindBy(id = "createTasksPopup_customerSelector")
	private WebElement selectCustomerDropDown;
	
	@FindBy(xpath = "//a[text()='HDFC_001']")
	private WebElement hdfcCustomerOption;
	
	@FindBy(id = "createTasksPopup_projectSelector")
	private WebElement selectProjectDropDown;
	
	@FindBy(xpath = "//a[text()='Banking Project']")
	private WebElement bankingProjectOption;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement task1Tf;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[2]")
	private WebElement task2Tf;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[3]")
	private WebElement task3Tf;
	
	@FindBy(xpath = "(//button[text()='set deadline'])[1]")
	private WebElement task1SetDeadLineCalender;
	
	@FindBy(xpath = "(//button[text()='set deadline'])[1]")
	private WebElement task2SetDeadLineCalender;
	
	@FindBy(xpath = "(//button[text()='set deadline'])[3]")
	private WebElement task3SetDeadLineCalender;
	
	@FindBy(xpath = "(//td[@class='billingTypeCell'])[1]")
	private WebElement task1TypeOfWorkBtn;
	
	@FindBy(xpath = "(//td[@class='billingTypeCell'])[2]")
	private WebElement task2TypeOfWorkBtn;
	
	@FindBy(xpath = "(//td[@class='billingTypeCell'])[3]")
	private WebElement task3TypeOfWorkbtn;
	
	@FindBy(xpath = "//a[text()='programming']")
	private WebElement task1WorkTypeIs;
	
	@FindBy(xpath = "//a[text()='analysis']")
	private WebElement task2WorkTypeIs;
	
	@FindBy(xpath = "//a[text()='design']")
	private WebElement task3WorkTypeIs;
	
	@FindBy(xpath = "//span[text()='27']")
	private WebElement task1DeadLineIs;
	
	@FindBy(xpath = "(//span[text()='28'])[2]")
	private WebElement task2DeadLineIs;
	
	@FindBy(xpath = "//span[text()='31']")
	private WebElement task3DeadLineIs;
	
	@FindBy(id = "createTasksPopup_commitBtn")
	private WebElement createTasksButton;
	
	@FindBy(xpath = "//span[text()='open account']")
	private WebElement openAccountTask;
	
	@FindBy(id = "editTaskPopup_statusSelectorPlaceholder")
	private WebElement statusDropDown;
	
	@FindBy(xpath = "//span[text()='Delete this task permanently']")
	private WebElement openAccountDeleteBtn;
	
	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement openAccountPermanentDeleteBtn;
	
	public WebElement getOpenAccountTask() {
		return openAccountTask;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getOpenAccountDeleteBtn() {
		return openAccountDeleteBtn;
	}

	public WebElement getOpenAccountPermanentDeleteBtn() {
		return openAccountPermanentDeleteBtn;
	}

	public Time_Track_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewTaskBtn() {
		return addNewTaskBtn;
	}

	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}

	public WebElement getHdfcCustomerOption() {
		return hdfcCustomerOption;
	}

	public WebElement getSelectProjectDropDown() {
		return selectProjectDropDown;
	}

	public WebElement getBankingProjectOption() {
		return bankingProjectOption;
	}

	public WebElement getTask1Tf() {
		return task1Tf;
	}

	public WebElement getTask2Tf() {
		return task2Tf;
	}

	public WebElement getTask3Tf() {
		return task3Tf;
	}

	public WebElement getTask1SetDeadLineCalender() {
		return task1SetDeadLineCalender;
	}

	public WebElement getTask2SetDeadLineCalender() {
		return task2SetDeadLineCalender;
	}

	public WebElement getTask3SetDeadLineCalender() {
		return task3SetDeadLineCalender;
	}

	public WebElement getTask1TypeOfWorkBtn() {
		return task1TypeOfWorkBtn;
	}

	public WebElement getTask2TypeOfWorkBtn() {
		return task2TypeOfWorkBtn;
	}

	public WebElement getTask3TypeOfWorkbtn() {
		return task3TypeOfWorkbtn;
	}

	public WebElement getTask1WorkTypeIs() {
		return task1WorkTypeIs;
	}

	public WebElement getTask2WorkTypeIs() {
		return task2WorkTypeIs;
	}

	public WebElement getTask3WorkTypeIs() {
		return task3WorkTypeIs;
	}

	public WebElement getTask1DeadLineIs() {
		return task1DeadLineIs;
	}

	public WebElement getTask2DeadLineIs() {
		return task2DeadLineIs;
	}

	public WebElement getTask3DeadLineIs() {
		return task3DeadLineIs;
	}

	public WebElement getCreateTasksButton() {
		return createTasksButton;
	}
	
	

}
