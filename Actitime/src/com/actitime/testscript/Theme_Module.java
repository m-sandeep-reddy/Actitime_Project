package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;
import com.actitime.pom.Home_Page;

public class Theme_Module extends Base_Class{
	
	@Test
	public void testChangingTheme()
	{
		Reporter.log("Changing Theme",true);
		
		Home_Page h = new Home_Page(driver);
		h.getSettingsBtn().click();
		h.getLogoAndColuorLink().click();
		h.getPurpleColourOption().click();
		h.getColurSaveSettingsBtn().click();
	
	}

}
