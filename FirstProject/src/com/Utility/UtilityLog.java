package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class UtilityLog {
	
	public class BaseTest {

		WebDriver driver;

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		@BeforeTest
		public void applicationLaunch()
		{

		System.setProperty("webdriver.chrome.driver", "./browserfile/chromedriver.exe");
		driver = new ChromeDriver();

		// System.out.println(" **** Chrome Browser Launched Successfully ********** ");
		Log.info("**** Chrome Browser Launched Successfully ********** ");

		driver.get(applicationUrlAddress);

		//System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page ");
		Log.info(" Successfully Navigated to OrangeHRM Application LogIn Page ");

		driver.manage().window().maximize();
 
		}


		@AfterTest
		public void applicationClose()
		{
		driver.quit();

		// System.out.println(" ************ Chrome Browser along with OrangeHRM Application Closed Successfully ********");

		Log.info(" ************ Chrome Browser along with OrangeHRM Application Closed Successfully *******");

		}	
	}
}