package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTS_HomePage_DisplayLinknames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationUrlAddress="htps://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		
		By linksProperty=By.tagName("a");
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);
		
		int tsrtcApplicationHomePageLinks_Count=tsrtcApplicationHomePageLinks.size();
		
			System.out.println("The number of WebElements which are of type links on the TSRTC Application HomePage is:-"+tsrtcApplicationHomePageLinks_Count);	
				
			for(int arrayindex=0;arrayindex<tsrtcApplicationHomePageLinks_Count;arrayindex++)	
			{
			String tsrtcHomePage_LinkName=tsrtcApplicationHomePageLinks.get(arrayindex).getText();
			
			System.out.println(arrayindex+"-"+tsrtcHomePage_LinkName);
	}
		driver.quit();	
			
			
}
	
}	
