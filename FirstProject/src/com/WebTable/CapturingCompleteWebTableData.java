package com.WebTable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableData extends BaseTest {
	
	@Test
	public void  getting_CompleteWebTableData() throws IOException
	{
		FileInputStream testDataFile = new FileInputStream("./src/com/OrangeHRM_LoginMultipleTestData/First Column CityNames.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		By tableProperty = By.tagName("tbody");
		WebElement table = driver.findElement(tableProperty);
		
		By rowsProperty = By.tagName("tr");
		List<WebElement>rows=table.findElements(rowsProperty);
		int rowCount = rows.size();
		System.out.println(rowCount);
		
		for(WebElement row:rows)
		{
			
			By rowOfCellProperty = By.tagName("td");
			List<WebElement>cells=row.findElements(rowOfCellProperty);
			for(WebElement cell:cells)
			{
			
				String cityName = cell.getText();
				System.out.print(cityName + " | "); 
			}
			System.out.println();
			
		}
		
	}

}
