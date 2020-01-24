package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testfb 
{
	
	
	
	@Test
	public void TestMethod()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		
		//enter the username
		driver.findElement(By.id("email")).sendKeys("tashuguddadamane@gmail.com");
		
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("Tashu@786");
		
		//click on login
		driver.findElement(By.id("loginbutton")).click();
		
		
		driver.findElement(By.id("placeholder-2njl1")).sendKeys("Hello");
		
		
		
		
		driver.close();
	}

}
