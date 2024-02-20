package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableData1 extends BaseTest{

	
	@Test
	public void getData_DynamicWebTable() throws IOException
	{
	// WebTable Property
	// /html/body/div[5]/section[1]/div

		FileInputStream testDataFile = new FileInputStream("./src/com/OrangeHRM_LoginMultipleTestData/Sahithya.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		
		
		
	// Identifying the WebTable
	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableProperty);

	// In the WebTable - Identifying the Row's of the WebTable
	List<WebElement>rows=webTable.findElements(By.tagName("tr"));

  
	// Going to all the Rows of the WebTable
	for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
	{
		Row Udumunra=testDataSheet.createRow(rowIndex-1);
		
	// Going to an arrayList - reaching a Particular Row of the WebTable
	WebElement row=rows.get(rowIndex);

	// going to a Row - and Identifying the Number of Row of Cells
	List<WebElement>webTableRowOfCells=row.findElements(By.tagName("td"));

	// To goto a Row - to all its Corresponding Cells
	for(int CellIndex=0;CellIndex<webTableRowOfCells.size();CellIndex++)
	{
		//Udumunra.createCell(CellIndex);
		Cell Swapna=Udumunra.createCell(CellIndex);
	// reaching to a Row of a Cell
	WebElement webTableRowOfCell=webTableRowOfCells.get(CellIndex);

	//get the data from the Row of a Cell 
	String data=webTableRowOfCell.getText();
	Swapna.setCellValue(data);
	

	System.out.print(data+" | ");
	}
	
	System.out.println();
	
	
	}
	FileOutputStream testOutPutFile = new FileOutputStream("./src/com/OrangeHRM_LoginMultipleTestData/Sahithya.xlsx");
	workBook.write(testOutPutFile);
	}
}
