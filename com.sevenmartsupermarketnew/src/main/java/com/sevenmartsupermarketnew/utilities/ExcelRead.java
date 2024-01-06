package com.sevenmartsupermarketnew.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sevenmartsupermarketnew.constants.Constants;

public class ExcelRead {
	XSSFSheet sheet;
	XSSFWorkbook workbook;

	XSSFRow row;
	XSSFCell cell; // Reference for reading excelsheet

	public void setExcelFile(String workBookName, String sheetName) {
		// name of the workbook and sheet where the datas to be taken
		try {
			String path = Constants.Excel_File_path + workBookName + ".xlsx";
			File src = new File(path);
			FileInputStream fi = new FileInputStream(src);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getCellData(int rowNo, int columnNo) {
		row = sheet.getRow(rowNo);
		cell = row.getCell(columnNo);
		switch (cell.getCellType()) {
		case STRING: {

			return cell.getStringCellValue();

		}
		case NUMERIC: {
			long d = (long) cell.getNumericCellValue();
			return String.valueOf(d);
		}

		default:
			return null;

		}
	}

}
