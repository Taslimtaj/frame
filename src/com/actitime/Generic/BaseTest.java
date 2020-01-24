package com.actitime.Generic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant
{

	public WebDriver driver;
	static
	{
		System.setProperty(geckokey, geckovalue);
		System.setProperty(Chromekey, chromevalue);
		
		}
	@BeforeMethod
	public void precondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		int status=res.getStatus();
		if(status==2)
		{
		 String	name=res.getMethod().getMethodName();
		}
		
		driver.close();
	}
}
