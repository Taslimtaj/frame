package com.actitime.Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseTest;
import com.actitime.Generic.Exceldata;

import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{

	@Test
	public void testInvalidLogin() throws InterruptedException
	{
		//updated class new 1
		String loginTittle = Exceldata.getData(filepath, "TC01",1,2);
		String expectedEM = Exceldata.getData(filepath, "TC02", 1,2);
		
		LoginPage lp = new LoginPage(driver);
		
		
		// verify Page
		lp.verifyPage(loginTittle);
		
		int rc = Exceldata.getRowCount(filepath, "TC02");
		
		System.out.println(rc);
		for (int i = 1; i <= rc; i++) 
		{
			String	un = Exceldata.getData(filepath, "TC02", i,0);
			String pw = Exceldata.getData(filepath, "TC02",i,1);
		
		
		// Enter UN
		Reporter.log("Invalid UN :"+un,true);
		lp.enterUserName(un);
		
		// Enter PW
		Reporter.log("Invalid pw :"+pw,true);
		lp.enterPassword(pw);
		
		// ClickOnLogin Bt
		lp.clickOnLogin();
		
		
		//Verify ErrorMessage
		String acctualEM = lp.verifyErrorMessage();
		
		Reporter.log("Actual error Meassge is :"+acctualEM,true);
		Reporter.log("Expected error Meassge is :"+expectedEM,true);
		
		
		Assert.assertEquals(acctualEM, expectedEM);
		Reporter.log("Error message is matching...........",true);
		Reporter.log("===========================,",true);
		Thread.sleep(2000);
		}
	}
}
