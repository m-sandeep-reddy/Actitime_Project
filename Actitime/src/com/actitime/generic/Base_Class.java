package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.Home_Page;
import com.actitime.pom.Login_Page;
import com.beust.jcommander.Parameter;

public class Base_Class {
	
	public static WebDriver driver;
	
	//@Parameters("browser")
	@BeforeTest
	public void openBrowser()
	//public void openBrowser(String browser)
	{
		Reporter.log("Open Browser",true);
		/*
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login",true);
		
		File_Lib f = new File_Lib();
		
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pw = f.getProperty("password");
		
		Login_Page l = new Login_Page(driver);
		
		driver.get(url);
		l.setLogin(un, pw);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
		Home_Page h = new Home_Page(driver);
		h.setLogout();
	}
	

}
