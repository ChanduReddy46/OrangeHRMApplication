package com.Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String [] args) {
	BaseTest test= new BaseTest();
	  
	test.applicationlaunch();
}
	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	
	
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
