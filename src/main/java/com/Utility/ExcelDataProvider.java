package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException {
		
		String xlPath = "C:\\Users\\admin\\eclipse-workspace\\shivrajFramework\\TestData\\Data.xlsx";
		
		FileInputStream fis1 = new FileInputStream(xlPath);
		
	    wb = new XSSFWorkbook(fis1);
		
		}
	
	public String getStringData(String sheetname, int row, int cell) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}

}
