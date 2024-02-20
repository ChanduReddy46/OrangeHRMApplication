package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class TestingBrowsers {

	public static void main(String[] args) {

		
		//Automating ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./browserfile/chromedriver.exe");

		//Class  object
		ChromeDriver srini =new ChromeDriver();
		
		srini.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		/*By Emailadressloc = By.name("EmailHomePage");
		WebElement Emailaddres=srini.findElement(Emailadressloc);
		Emailaddres.sendKeys("pravallika");
		*/
		WebElement Username=srini.findElement(By.id("txtUsername"));
		Username.sendKeys("ChanduReddy");
		 
	WebElement Password=srini.findElement(By.id("txtPassword"));
	Password.sendKeys("Chandu@reddy7981");
	
		
		srini.findElement(By.name("Submit")).click();;
		 
		 
		 WebElement ClickviewAdminModule=srini.findElement(By.id("menu_admin_viewAdminModule"));
		 ClickviewAdminModule.click(); 
			
		 WebElement ClickAdminnationality=srini.findElement(By.id("menu_admin_nationality"));
		 ClickAdminnationality.click(); 
		 
		/*WebElement FindElement=srini.findElement(By.id("btnAdd"));
		  FindElement.click(); 
			 
		  WebElement FindElement1=srini.findElement(By.id("nationality_name"));
		  FindElement1.sendKeys("india110"); 	 
			 
		  WebElement FindElement2=srini.findElement(By.id("btnSave"));
		FindElement2.click();
		  
		  WebElement FindElement3=srini.findElement(By.id("nationality_name"));
		  FindElement3.sendKeys("india110");
		  */
	
	/*WebElement FindElement4=srini.findElement(By.id("ohrmList_chkSelectRecord_195"));
	FindElement4.click();
	
	WebElement FindElement5=srini.findElement(By.id("btnDelete"));
	FindElement5.click();
	
WebElement FindElement6=srini.findElement(By.id("dialogDeleteBtn"));
	FindElement6.click();
	*/
	
	//srini.findElement(By.name("Cancel")).click();
	 
			
		

		//By	userNameProperty=By.id("txt)Username");
		
	//	By driver;
	//	WebElement userName=driver.findElement(userNameProperty);
		
		
		
		
		// Automating Edge Browser
		//System.setProperty("webdriver.edge.driver","./browserfile/msedgedriver.exe");
		
		//EdgeDriver srini =new EdgeDriver();
		
		
		//Automating FireFox Browser
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\chand\\OneDrive\\Desktop\\Chandu Reddy\\SeleniumWebDriver\\browserfile\\geckodriver.exe");
		
		
		//FirefoxDriver firefox =new FirefoxDriver();
		
		
		
		//Automating Opera Browser
		//System.setProperty("webdriver.opera.driver","./browserfile/operadriver.exe");
		
		//OperaDriver chandu =new OperaDriver();
		
		
		
		
		
		
	}

}