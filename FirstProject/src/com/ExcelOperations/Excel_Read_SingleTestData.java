package com.ExcelOperations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
	/*	// Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("TestDataSheet");

		// Identify a Particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(2);

		// Identify a Particular Row of a Cell in the Row
		Cell testDataRowOfCell=testDataSheetRow.getCell(2);

		// Get the Test data from the Row Of Cell
		String testData=testDataRowOfCell.getStringCellValue();

		System.out.println(testData);
*/
		
		// Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("TestDataSheet");

		// create a particular Row in the Sheet
		Row newRow=testDataSheet.createRow(5);

		// Create a Particular Row of a Cell in the Row
		Cell newRowOfNewCell=newRow.createCell(6);

		// Sending the Test data into the New Row Of Cell Created
		newRowOfNewCell.setCellValue("Selenium");

		// The Excel File along with the WorkBook should be saved
		FileOutputStream testDataResultFile = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workBook.write(testDataResultFile);


		
		
	}

}
