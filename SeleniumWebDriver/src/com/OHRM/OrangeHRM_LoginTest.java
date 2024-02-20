package com.OHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHRM_LoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		String applicaionUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get(applicaionUrlAddress);
		
		String expected_OrangeHRMApplicationloginPageTitle="OrangeHRM";
		System.out.println("The expected title of the OrangeHRm Application Login Page is:-"+expected_OrangeHRMApplicationloginPageTitle);
		
		String actual_OrangeHRMApplicationloginPageTitle=driver.getTitle();
		System.out.println("The actual tiltle of the OrangeHRm Application Login Page is:-"+actual_OrangeHRMApplicationloginPageTitle);
		
		
		if(actual_OrangeHRMApplicationloginPageTitle.equals(expected_OrangeHRMApplicationloginPageTitle))
		{
			System.out.println("Successfully navigated to OrangeHRM Application Login WebPage-PASS");
			
		}
		else
		{
			System.out.println("Failed to Navigate to OrangeHRM Application Login WebPage-FAIL");
		}
		
		String expected_ApplicationUrlAddres="orangehrm";
		String actual_ApplicationUrlAddres=driver.getCurrentUrl();
		
		System.out.println(actual_ApplicationUrlAddres);
		
		if(actual_ApplicationUrlAddres.contains(expected_ApplicationUrlAddres))
		{
		System.out.println("Successfully navigated to OrangeHRM Application Login Page - URL found - PASS");
		
		}
		else
		{
			System.out.println("Successfully navigated to OrangeHRM Application Login Page - URL found - FAIL");
		}
		
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys("ChanduReddy");
		 
	WebElement Password=driver.findElement(By.id("txtPassword"));
	Password.sendKeys("Chandu@reddy7981");
	
		
	driver.findElement(By.name("Submit")).click();
	
	String expected_OrangeHRMApplicationHOMEPageTitle="OrangeHRM";
	System.out.println("The expected title of the OrangeHRm Application Login Page is:-"+expected_OrangeHRMApplicationloginPageTitle);
	
	String actual_OrangeHRMApplicationHOMEPageTitle=driver.getTitle();
	System.out.println("The actual tiltle of the OrangeHRm Application Login Page is:-"+actual_OrangeHRMApplicationloginPageTitle);
	
	
	if(actual_OrangeHRMApplicationloginPageTitle.equals(expected_OrangeHRMApplicationloginPageTitle))
	{
		System.out.println("Successfully navigated to OrangeHRM Application Login WebPage-PASS");
		
	}
	else
	{
		System.out.println("Failed to Navigate to OrangeHRM Application Login WebPage-FAIL");
	}
	
	WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
	welcomeAdmin.click();
Thread.sleep(1000);
	
	//WebElement welcomeAdmin1=driver.findElement(By.id("welcome-menu"));
	//welcomeAdmin1.click();
	
	//WebElement welcomeAdmin3=welcomeAdmin1.findElement(By.linkText("About"));
	//welcomeAdmin3.click();
	
	WebElement welcomeAdmin4=driver.findElement(By.linkText("Logout"));
	welcomeAdmin4.click();
	
	
	 Username=driver.findElement(By.id("txtUsername"));
	Username.sendKeys("ChanduReddy");
	 
 Password=driver.findElement(By.id("txtPassword"));
Password.sendKeys("Chandu@reddy7981");

	
driver.findElement(By.name("Submit")).click();
	
	
driver.quit();
		}
	
	
}









