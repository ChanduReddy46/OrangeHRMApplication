package com.ApplicationLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo_Bing_HomePage {

	public static void main(String[] args) {
				//Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
		ChromeDriver chromeBrowser=new ChromeDriver();
		
		chromeBrowser.get("https://www.flipkart.com/");
		
		chromeBrowser.manage().window().maximize();
		  
		//chromeBrowser.("YBLJE4");
		
	
			//Navigating to Bing Application HomePage
			//chromeBrowser.get("https://www.bing.com/");
			
			// Maximizing the Browser
			 //driver.manage().window().maximize();
	
			
			//ChromeBrowser-which is an object always points to Current Browser
			//chromeBrowser.get("https://www.flipkart.com/");
			
		
	//	chromeBrowser.get("https://www.flipkart.com/");
		
		
		//<div class="YBLJE4"><div class="_3ETuFY"><div class="_2GaeWJ" style="width:64px;height:64px"><img class="_2puWtW _3a3qyb" alt="Mobiles" src="https://rukminim2.flixcart.com/flap/80/80/image/22fddf3c7da4c4f4.png?q=100"></div></div><span class="_1XjE3T"><span>Mobiles</span></span></div>
		//chromeBrowser.findElement(By.className("_2puWtW _
		
		
		
		
			
		/*	WebDriver driver;
			String ApplicationUrlAddress="https://open.spotify.com/";
			
			System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(ApplicationUrlAddress);
			
			//Maximizing the  Browser
			driver.manage().window().maximize();
			
			driver.findElement(By.name("search")).click();
			
			
			driver.quit();
			*/
			
	}
	


}
