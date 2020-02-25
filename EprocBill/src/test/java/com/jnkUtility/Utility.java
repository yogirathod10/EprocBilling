package com.jnkUtility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	public static void main(String[] args) {
	}
	
	public static String getData (String sheetName,int row , int col)throws Exception {
		File f = new File("D:\\Java and testing\\LiveProject\\EprocBill\\src\\test\\resources\\Excel\\TestData.xlsx");
		FileInputStream fis  = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		String Data = sh.getRow(row).getCell(col).getStringCellValue();
		return Data;
		
	
	}

}
