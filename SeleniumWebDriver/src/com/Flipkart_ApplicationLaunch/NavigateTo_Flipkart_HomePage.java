package com.Flipkart_ApplicationLaunch;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo_Flipkart_HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("Webdriver.chrome.driver","./browserfile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		

		//ChromeDriver driver ;
		String applicationUrlAddress="https://www.flipkart.com/";
		
		
		
		
		
		// Maximizing the Browser
				driver.manage().window().maximize();


				}


				//public void applicationClose()
				{
				//driver.quit();
		
		
	}

}
