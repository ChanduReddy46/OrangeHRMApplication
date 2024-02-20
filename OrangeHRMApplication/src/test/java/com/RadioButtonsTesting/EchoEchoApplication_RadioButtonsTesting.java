package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class EchoEchoApplication_RadioButtonsTesting extends BaseTest {
	
	
	@Test
	public void group1RadioButtonsTesting() throws InterruptedException
	{
		By group1RadioButtonsProperty = By.name("group1");
		List<WebElement>group1RadioButtons = driver.findElements(group1RadioButtonsProperty);
		int group1RadioButtons_Count = group1RadioButtons.size();
		
		System.out.println(" The Number of Radio Buttons in group1 are : - " + group1RadioButtons_Count);
		
		for(int radioButtonClick=0;radioButtonClick<group1RadioButtons_Count;radioButtonClick++)
		{
			
			String group1radioButtonName = group1RadioButtons.get(radioButtonClick).getAttribute("value");
			System.out.println(group1radioButtonName);
			
			group1RadioButtons.get(radioButtonClick).click();
			
			Thread.sleep(5000);
			
			for(int radioButtonsStatus=0;radioButtonsStatus<group1RadioButtons_Count;radioButtonsStatus++)
			{
			
				System.out.println(group1RadioButtons.get(radioButtonsStatus).getAttribute("value") + "-" + group1RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
			}
		}
	}

}
