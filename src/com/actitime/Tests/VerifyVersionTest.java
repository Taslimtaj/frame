package com.actitime.Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.Generic.BaseTest;
import com.actitime.Generic.Exceldata;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority = 3)
	public void testVerifyVersion()
	{
		String lTittle = Exceldata.getData(filepath, "TC01",1, 2);
		String Eversion = Exceldata.getData(filepath, "TC03", 1, 0);
		LoginPage lp = new LoginPage(driver);
		//verify Tittle
		lp.verifyTittle(lTittle);
		
		// verify Version
		String AVersion = lp.verifyVersion();
		
		Reporter.log("Actual Version is : "+AVersion,true);
		Reporter.log("Expected Version is : "+Eversion,true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(AVersion, Eversion);
		sa.assertAll();
		Reporter.log("Version is matching :",true);
	}


}
