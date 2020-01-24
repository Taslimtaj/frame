package com.actitime.Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata implements Autoconstant
{
	public static String getData(String filepath,String sheetName,int rn,int cn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Row r = wb.getSheet(sheetName).getRow(rn);
			String data = r.getCell(cn).getStringCellValue();
			return data;
		} 
		catch (Exception e) 
		{
			return " "; 
		}
	}
	public static int getRowCount(String filepath,String sheetName)
	{
		try
		{
			FileInputStream fis  = new FileInputStream(new File (filepath));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	public static int getCellCount(String filepath,String sheetName,int rn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filepath));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
		Row rc = sh.getRow(rn);
		short cc = rc.getLastCellNum();
			return cc;
		} 
		catch (Exception e)
		{
			return 0;
		}
	}

}