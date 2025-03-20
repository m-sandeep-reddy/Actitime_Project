package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.IDataProviderMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;
import org.testng.internal.reflect.DataProviderMethodMatcher;

public class Data_Provider {
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = {{"admin","manager"},{"sandeep","reddy"},{"robo","bahubali"}};
		return data;
	}
	
	@Test(dataProvider = "testGetData" , dataProviderClass = Data_Method_Provider.class)
	public void demo(String un,String pwd) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.id("username")).sendKeys(un);
		//Thread.sleep(3000);
		d.findElement(By.name("pwd")).sendKeys(pwd+Keys.ENTER);
		Thread.sleep(1000);
		d.quit();
		
	}

}
