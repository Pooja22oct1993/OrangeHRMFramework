package com.myvtechsolutions.orangehrm0358.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public static XSSFWorkbook workbook;
	public ExcelDataProvider(String filepath) {
try {		
	FileInputStream fins = new FileInputStream(filepath);
	XSSFWorkbook workbook = new XSSFWorkbook();


	
} catch (Exception e) {
	// TODO: handle exception
}
}
	public static int getRowCount(String sheetname) {
		return workbook.getSheet(sheetname).getLastRowNum();}
		
		
		public static int getRowCount(int index) {
			return workbook.getSheetAt(index).getLastRowNum();
		
	}
	public static int getColsCount(String sheetname) {
		return workbook.getSheet(sheetname).getRow(0).getLastCellNum();
		
	}
	public static void getstringCellvalue(String sheetname, int row ,int col){
		workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();}
	
	
	public static int getNumericCellData(int index, int row ,int col){
		return (int)workbook.getSheetAt(0).getRow(row).getCell(col).getNumericCellValue();}
	
	public static void getstringCellData(String sheetname, int row ,int col){
		workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();}
		
		
		
		
		
		
		
		
		
		
	}

}
