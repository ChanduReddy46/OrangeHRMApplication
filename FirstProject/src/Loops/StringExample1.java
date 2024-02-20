package Loops;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Starting");
		String name = sc.nextLine();
		int c=0;
		for (int w=0; w<name.length();w++)
		{
			char ch = name .charAt(w);
			if(ch>='a'  && ch<='z')
				c++;
		}
		System.out.println(c);
		
		
		//WebElement welcomeAdmin1=driver.findElement(By.id("welcome-menu"));
		//welcomeAdmin1.click();
		
		//WebElement welcomeAdmin3=welcomeAdmin1.findElement(By.linkText("About"));
		//welcomeAdmin3.click();

		/*	
		List<WebElement> actualElements = driver.findElements(By.className("Block default editable"));
			
			for(webElemenet actaualvalue:actualElements)
			{
			
				String actalNames = actualvalues.getAttribute("value");
				System.out.println(actualNames);
			*/
			 
	}

}
