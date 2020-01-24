package trial;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class wind 

{
	static
	{
		System.setProperty("webdriver.geckho.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.close();
		
	}
		
		
	

}
