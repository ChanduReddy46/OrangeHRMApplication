package com.ScreenShot;

import java.io.File;
import  java.io.IOException;





import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePage_CapturingScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String ApplicationUrlAddress="http://bing.com";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\OneDrive\\Desktop\\Chandu Reddy\\SeleniumWebDriver\\browserfile\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(ApplicationUrlAddress);

		// TakesScreenshot - its an interface
		// driver - is an object of a Class / Interface
		// ((TakesScreenshot)driver) - this process is referred to as Type Casting

		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File("./ApplicationScreenShots/bingHomePageScreenShot.png"));

		
		
		FileUtils.copyFile(webPageScreenShot, new File("C:\\Users\\chand\\OneDrive\\Desktop\\ApplicationScreenShots\\bingHomePageScreenShot.png"));

		
		
		
	}

}
