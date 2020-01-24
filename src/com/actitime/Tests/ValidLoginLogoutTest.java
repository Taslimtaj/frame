package com.actitime.Tests;

import org.testng.annotations.Test;

import com.actitime.Generic.BaseTest;
import com.actitime.Generic.Exceldata;
import com.actitime.pages.EnterTimeTrackerPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
	
		String lTittle = Exceldata.getData(filepath,"TC01",1,2);
		String un= Exceldata.getData(filepath,"TC01",1,0);
		String pw = Exceldata.getData(filepath, "TC01",1,1);
		String enterTimeTrackerTittle = Exceldata.getData(filepath, "TC01",1,3);
	
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackerPage ep = new EnterTimeTrackerPage(driver);
	
		//Verify Tittle
		lp.verifyPage(lTittle);
		
		//enter username
		lp.enterUserName(un);

		//Enter Password
		lp.enterPassword(pw);
		
		//Click onLoginBt
		lp.clickOnLogin();
		
		//Verify Enter Time Tracker Page
		ep.verifyTittle(enterTimeTrackerTittle);
		
		//Click on Logout
		ep.clickOnLogout();
		
		//verify loginpage
		lp.verifyPage(lTittle);
	}

}
