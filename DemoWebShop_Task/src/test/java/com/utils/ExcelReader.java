package com.utils;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader{
	public static String[] getCheckoutData(String filePath, String sheetName, int rowNum) throws IOException {
	    FileInputStream file=new FileInputStream(filePath);
	    XSSFWorkbook workbook=new XSSFWorkbook(file);
	    XSSFSheet sheet=workbook.getSheet(sheetName);
	    XSSFRow row = sheet.getRow(rowNum);
	    if (row == null) {
	        throw new NullPointerException("Row " + rowNum + " is empty or doesn't exist in sheet: " + sheetName);
	    }
	    int cellCount = row.getLastCellNum();
	    String[] data = new String[cellCount];
	    for (int i = 0; i < cellCount; i++) {
	        XSSFCell cell=row.getCell(i);
	        if (cell == null) {
	            data[i] = "";
	            continue;
	        }
	        switch (cell.getCellType()) {
	            case STRING:
	                data[i]=cell.getStringCellValue();
	                break;
	            case NUMERIC:
	                data[i]=String.valueOf((int) cell.getNumericCellValue());
	                break;
	            case BOOLEAN:
	                data[i]=String.valueOf(cell.getBooleanCellValue());
	                break;
	            default:
	                data[i]=cell.toString();
	        }
	    }
	    workbook.close();
	    return data;
	}

}
