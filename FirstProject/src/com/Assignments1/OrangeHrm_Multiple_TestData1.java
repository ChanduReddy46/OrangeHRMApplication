package com.Assignments1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHrm_Multiple_TestData1 {

	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\OneDrive\\Desktop\\Chandu Reddy\\SeleniumWebDriver\\browserfile\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// Validating Title
		String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
		System.out.println(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

		String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
		System.out.println(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);
		
		if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
		{
		System.out.println("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
		}
		// validating Url

		// Validating Text - LOGIN Panel

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

		// id="logInPanelHeading"
		By orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

		String actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
		System.out.println(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
		}
		else
		{
		System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
		}
		
		FileInputStream loginTestDataFile = new FileInputStream("./src/com/OrangeHRM_LoginMultipleTestData/Sahithya.xlsx");
		XSSFWorkbook workBook= new XSSFWorkbook(loginTestDataFile);
		XSSFSheet loginTestDataSheet = workBook.getSheet("Sheet1");
		
		int rowcount= loginTestDataSheet.getLastRowNum();
		System.out.println(rowcount);
		for (int rowIndex=0;rowIndex<=rowcount;rowIndex++)
		{
			Row loginTestDataSheetRow=loginTestDataSheet.getRow(rowIndex);
			
			String testData= loginTestDataSheetRow.getCell(0).getStringCellValue();
			String testData1= loginTestDataSheetRow.getCell(1).getStringCellValue();
			
			
			
			By userNameProperty=By.id("txtUsername"); 
			
			WebElement userName=driver.findElement(userNameProperty);
			userName.sendKeys(testData);
			By passwordProperty=By.name("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(testData1);
			
			By  loginBuutonProperty=By.className("button");
			WebElement loginButton=driver.findElement(loginBuutonProperty);
			loginButton.click();
			
			try
			{
				By welComeAdminProperty=By.partialLinkText("Admin");
				
				WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
				
				String expected_OrangeHRMApplicationHomePageText="Welcome";
				System.out.println("The Expected text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
				
				String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
				System.out.println("The Actual of the OrangeHRM Application HomePage is :-"+actual_OrangeHRMApplicationHomePageText);
				
				
				
				if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
				{
					System.out.println("Succcessfully Navigated to OrangeHRM Application HomePage - PASS ");
					
					Cell testrowOfCell=loginTestDataSheetRow.createCell(2);
					testrowOfCell.setCellValue("Succcessfully Navigated to OrangeHRM Application HomePage - PASS");
				}
				else
				{
					 System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
					 
					 
					Cell testRowOfCell=loginTestDataSheetRow.createCell(2);
					testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePagec - fAIL ");
				}
				FileOutputStream testDataResultsFile = new FileOutputStream("./src/com/OrangeHRM_LoginMultipleTestData/Sahithya.xlsx"); 
				workBook.write(testDataResultsFile);
				
                By welComeAdminProperty1=By.partialLinkText("Admin");
				
				WebElement welComeAdmin1=driver.findElement(welComeAdminProperty1);
				welComeAdmin1.click();
				Thread.sleep(1000); //wait for java
				
			By logOutputProperty=By.linkText("Logout");
			WebElement logOut=driver.findElement(logOutputProperty);
			logOut.click();
			}
			catch(Exception e1)	
			{
				
			}
			
			try
			{
				String expected_LogInPageText="Invalid credentials";
				
			By OrangeHRMLogInTextProperty=By.id("spanMessage");
			WebElement orangeHRMLogInPage=driver.findElement(OrangeHRMLogInTextProperty);
			
			String actual_OrangeHRMLogInPageText=orangeHRMLogInPage.getText();
			System.out.println("The Actual Text of the OrangeHRM Application Login Page is :- "+ actual_OrangeHRMLogInPageText);
			
			File logInPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(logInPageScreenShot, new File("./OrangeHRM_ScreenShots/" +actual_OrangeHRMApplicationLogInPageText+ rowIndex+ ".png"));
			
			if(expected_LogInPageText.endsWith(actual_OrangeHRMLogInPageText))
			{
			
				System.out.println("Failed to navigate to the OrangeHRM Home Page");
				
				Cell newRowOfCell = loginTestDataSheetRow.createCell(2);
				newRowOfCell.setCellValue("Failed to navigate to the OrangeHRM Home Page ");
			}
			else
			{
				System.out.println("Successfully navigated to the OrangeHRM Home Page ");
			}
			}
			catch(Exception e)
			{
				System.out.println("e");
			}
			FileOutputStream testDataResultFile = new FileOutputStream("./src/com/OrangeHRM_LoginMultipleTestData/SahithyaTestResultFile.xlsx");
			workBook.write(testDataResultFile);
			
			driver.navigate().refresh();
		}	
				
				
			//driver.quit();
			
			
			
			
			
			
				
			}
			
		}

	
	
	
	
	
	
	

