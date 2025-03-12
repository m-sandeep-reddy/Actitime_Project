package com.actitime.testscript;

import org.testng.annotations.DataProvider;

public class Data_Method_Provider {
	
	@DataProvider
	public Object[][] testGetData()
	{
		Object [][] data = {{"admin","manager"},{"jack","rose"},{"wine","beer"}};
		return data;
	}

}
