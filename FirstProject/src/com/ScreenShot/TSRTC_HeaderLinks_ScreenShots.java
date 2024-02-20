package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderLinks_ScreenShots {

	public static void main(String[] args) throws IOException {

		//WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\OneDrive\\Desktop\\Chandu Reddy\\SeleniumWebDriver\\browserfile\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//driver = new ChromeDriver();
		driver.get(applicationUrlAddress);

		// Identifying the property of the Header Block of the WebPage
		// class="menu-wrap"

		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		// <a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>

		// identifying the common Property of the Elements
		By tsrtc_HeaderBlocklinksProperty=By.tagName("a");

		// of the Header Block finding all the WebElement
		List<WebElement>tsrtc_HeaderBlocklinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlocklinksProperty);

		// finding the size of the ArrayList
		int tsrtc_HeaderBlocklinksCount=tsrtc_HeaderBlocklinks.size();
		System.out.println
		(" The Number of links in the Header Block of TSRTC Application HomePage is :- "+tsrtc_HeaderBlocklinksCount);


		// displaying all the WebELements names of the Header Block

		for(int arrayIndex=0;arrayIndex<tsrtc_HeaderBlocklinksCount;arrayIndex++)
		{
		String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlocklinks.get(arrayIndex).getText();
		System.out.println(arrayIndex+" - "+tsrtc_HeaderBlockLinkName);

		tsrtc_HeaderBlocklinks.get(arrayIndex).click();
		
		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File("./ApplicationScreenShots/"+tsrtc_HeaderBlockLinkName+".png"));

		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);

		String webPageUrlAddress=driver.getCurrentUrl();
		System.out.println(webPageUrlAddress);

		System.out.println();

		// coming back to the previous page
		driver.navigate().back();
		//driver.navigate().refresh();


		tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		tsrtc_HeaderBlocklinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlocklinksProperty);

		}




		driver.quit();

}
	
	
}
