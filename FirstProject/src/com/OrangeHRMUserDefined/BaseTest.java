package com.OrangeHRMUserDefined;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		
		public void applicationlaunch()
		{
			System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
			driver= new ChromeDriver();
			
			
			driver.get(applicationUrlAddress);
			
			
			driver.manage().window().maximize();
			
		}
		public void applicationClose()
		{
			driver.close();
		}

	
	
}
