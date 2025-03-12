package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.actitime.generic.Base_Class;

public class Reports_Page {
	
	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement addNewReportButton;
	
	@FindBy(id = "configureReportParametersButton")
	private WebElement addStaffReportButton;
	
	@FindBy(xpath = "(//span[text()='Generate HTML Report'])[2]")
	private WebElement generateHtmlReportButton;
	
	public Reports_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewReportButton() {
		return addNewReportButton;
	}

	public WebElement getAddStaffReportButton() {
		return addStaffReportButton;
	}

	public WebElement getGenerateHtmlReportButton() {
		return generateHtmlReportButton;
	}
	
	

}
