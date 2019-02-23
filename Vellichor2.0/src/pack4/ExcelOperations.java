package pack4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.tools.FileObject;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperations
{
	public static String readDta(String sheetName,int rowNum,int cellNum)
	{

	try
	{
	FileInputStream fis =new FileInputStream(".\\RESOURCES\\TESTDATA\\Vellichor data.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	String data =w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue(); 
	return data;
	}
	catch(Exception rv)
	{
		System.out.println("exception occured");
		return "";
	}
	}
	public static void writeData(String sheetName,int rowNum,int cellNum,String string)
	{
	
		try 
		{
			FileInputStream fis = new FileInputStream(".\\RESOURCES\\TESTDATA\\Vellichor data.xlsx");
			Workbook W1= WorkbookFactory.create(fis);
			W1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(string);
			FileOutputStream fos =new FileOutputStream(".\\RESOURCES\\TESTDATA\\Vellichor data.xlsx");
			W1.write(fos);
			
		} 
		catch (Exception rv)
		{
		System.out.println("Exception occured");
		
		}
		
	}
}
	


