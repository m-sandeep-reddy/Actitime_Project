package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	WebDriver d;
	
	@Parameters({"browser","url","un","pwd"})
	@Test
	public void login(String browser,String url , String username , String password ) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
			d = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			d = new EdgeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.name("pwd")).sendKeys(password+Keys.ENTER);
		Thread.sleep(3000);
		d.quit();
	}
	
	/*@Parameters({"browser","url"})
	@Test
	public void open(String browser , String url) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
			d = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			d = new EdgeDriver();
		d.get(url);
		Thread.sleep(3000);
		d.quit();
	}*/
	
	/*@Parameters({"browser","url","un","pwd"})
	@Test
	public void login(String browser , String url , String username , String password ) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
			d = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			d = new EdgeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.name("pwd")).sendKeys(password+Keys.ENTER);
		Thread.sleep(3000);
		d.quit();
	}*/
	

}
