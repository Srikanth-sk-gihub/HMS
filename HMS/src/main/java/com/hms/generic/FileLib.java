package com.hms.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String readProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.doctorproperties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public String  readExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/testdoctor.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 String  data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		    return data;
	}
	public void writeExcel(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/testdoctor.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data/testdoctor.xlsx");
		wb.write(fos);
		wb.close();
	}

}
