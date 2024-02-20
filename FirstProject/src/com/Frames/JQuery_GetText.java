package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_GetText extends BaseTest {
	
	public void jQuery_getText_DragMeToMyTarget() 

	 {
 //  Property of the Frames
//   <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

		By JQueryFrameProperty=By.className("demo-frame");
		WebElement jQueryFrame=driver.findElement(JQueryFrameProperty);  
		
		driver.switchTo().frame(jQueryFrame);
		
		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
		String dragMeToMyTarget_Text=dragMeToMyTarget.getText();

		System.out.println(" The Text of the WebElement is :- "+dragMeToMyTarget_Text);


		}

		public static void main(String[] args)  {

		JQuery_GetText jQuery = new JQuery_GetText();
		jQuery.applicationlaunch();
		jQuery.jQuery_getText_DragMeToMyTarget();

		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		// Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element

		jQuery.applicationClose();
		 
		
		
	}

}
