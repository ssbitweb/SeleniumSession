package com.DataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		
		XSSFWorkbook ExcelWbook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		
		String path = "C:\\Selenium_Automation\\Projects\\LetsKodeIt\\src\\com\\Data\\ExcelData.xlsx";
		String sheetName ="Sheet1";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ExcelWbook = new XSSFWorkbook(fis);
			ExcelWSheet = ExcelWbook.getSheet(sheetName);
			
			Cell = ExcelWSheet.getRow(0).getCell(0);
			String fName = Cell.getStringCellValue();
			System.out.println("My name Is :" + fName);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
