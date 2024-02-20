package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTestData_Add_Employee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);
		
		//Maximizing The Browser
		driver.manage().window().maximize();
		
		String expected_OrangeHRMApplicationloginPageTitle="OrangeHRM";
		System.out.println("The expected title of the OrangeHRm Application Login Page is:-"+expected_OrangeHRMApplicationloginPageTitle);
		
		String actual_OrangeHRMApplicationloginPageTitle=driver.getTitle();
		System.out.println("The actual tiltle of the OrangeHRm Application Login Page is:-"+actual_OrangeHRMApplicationloginPageTitle);
		
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys("ChanduReddy");
		 
	WebElement Password=driver.findElement(By.id("txtPassword"));
	Password.sendKeys("Chandu@reddy7981");
	
		
	driver.findElement(By.name("Submit")).click();
		
	WebElement ClickViewPIMModule =driver.findElement(By.id("menu_pim_viewPimModule"));
	ClickViewPIMModule.click();
	
	WebElement ClickAddEmployee =driver.findElement(By.id("menu_pim_addEmployee"));
	ClickAddEmployee.click();
	
	WebElement FirstName=driver.findElement(By.id("firstName"));
	FirstName.sendKeys("Superstar");
	 
	WebElement MiddleName=driver.findElement(By.id("middleName"));
	MiddleName.sendKeys("Mahesh");
	 
	WebElement LastName=driver.findElement(By.id("lastName"));
	LastName.sendKeys("babu");
	
	WebElement EmployeeId=driver.findElement(By.id("employeeId"));
	EmployeeId.sendKeys("");
	
	driver.findElement(By.id("btnSave")).click();

	
	 By actual_FirstNameProperty=By.id("personal_txtEmpFirstName");
	WebElement FirstNameElement=driver.findElement(actual_FirstNameProperty);
	
	String actual_FirstName=FirstNameElement.getAttribute("value");
	System.out.println("Actual FirstName :-" + actual_FirstName);
	
	 By actual_MiddleNameProperty=By.id("personal_txtEmpMiddleName");
		WebElement MiddleNameElement=driver.findElement(actual_MiddleNameProperty);
	
		String actual_MiddleName=FirstNameElement.getAttribute("value");
		System.out.println("Actual MiddleName :-" + actual_MiddleName);
		
		 By actual_LastNameProperty=By.id("personal_txtEmpLastName");
			WebElement LastNameElement=driver.findElement(actual_LastNameProperty);
		
			String actual_LastName=FirstNameElement.getAttribute("value");
			System.out.println("Actual MiddleName :-" + actual_LastName);

		
	 By employeeId_Property=By.id("personal_txtEmployeeId");
	WebElement employeeId=driver.findElement(employeeId_Property);
	
	
	String actual_EmployeeId=employeeId.getAttribute("value");
	System.out.println("Actual EmployeeId : -" + actual_EmployeeId);
	
	
	
	
	System.out.println("#######Validating FirstName#######");
	
	if(FirstName.equals(actual_FirstName))
	{
		
		System.out.println("Employee FirstName Added successfully");
	}	
		
	else
	{
		
		System.out.println("Failed to Add Employee FirstName");
	
	}
System.out.println("#######Validating MiddleName#######");
	
	if(MiddleName.equals(actual_MiddleName))
	{
		
		System.out.println("Employee MiddleName Added successfully");
	}	
		
	else
	{
		
		System.out.println("Failed to Add Employee MiddleName");
	}
System.out.println("#######Validating LastName#######");
	
	if(LastName.equals(actual_LastName))
	{
		
		System.out.println("Employee LastName Added successfully");
	}	
		
	else
	{
		
		System.out.println("Failed to Add Employee LastName");
	}
	
	WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
	welcomeAdmin.click();
Thread.sleep(1000);
	
	
	
	WebElement welcomeAdmin4=driver.findElement(By.linkText("Logout"));
	welcomeAdmin4.click();
	
	driver.quit();
}
}
