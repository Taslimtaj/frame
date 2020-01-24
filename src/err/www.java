package err;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class www 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
	}
	
	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		Thread.sleep(3000);
		WebElement clickElement = driver.findElement(By.cssSelector("button#button1"));
		Thread.sleep(3000);
		clickElement.click();
		System.out.println("the child element"+clickElement);
			Thread.sleep(3000);
//		for(int i = 0; i < 3; i++)
//	
//		{
//		clickElement.click();
//	System.out.println("the child element"+clickElement);
//		Thread.sleep(3000);
//		
//		
//		}
		driver.quit();


	


}
}