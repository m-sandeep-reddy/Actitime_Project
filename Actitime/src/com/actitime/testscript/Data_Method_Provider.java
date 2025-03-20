package com.actitime.testscript;

import org.testng.annotations.DataProvider;

public class Data_Method_Provider {
	
	@DataProvider
	public Object[][] testGetData()
	{
		Object [][] data = {{"rohith.ramesh2202@gmail.com","rohith123"},{"jhon@gmail.com","jhon123"},{"admin","manager"},{"jack","rose"},{"wine","beer"}};
		return data;
	}

}
