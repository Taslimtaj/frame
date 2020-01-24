package err;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prac {
	
	@Test
	public void verifyLoginpage()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String eTitle="actiTIME - Login";
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).click();
		//String aTitle = driver.getTitle();
		//Assert.assertEquals(eTitle, aTitle);
		
		driver.close();
	}

	

}
