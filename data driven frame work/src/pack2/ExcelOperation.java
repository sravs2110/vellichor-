package pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class ExcelOperation {

	public static String readData(String sheetname,int rowNum,int cellNum)
	{
	try 
	{
		FileInputStream fis=new FileInputStream("D:\\test data\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String data=w1.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
		
	}
	catch(Exception rv)
	{
		System.out.println("exception occured");
		return "";
		
		
		
	}

	}
	public static void writeData(String sheetname,int rowNum,int cellNum,String string)
	{
		try
		{
		FileInputStream fis=new FileInputStream("D:\\test data\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetname).getRow(rowNum).createCell(cellNum).setCellValue(string);
		FileOutputStream fos=new FileOutputStream("D:\\test data\\userdata.xlsx");
		w1.write(fos);
		
		}
		catch(Exception rv1)
		{
			System.out.println("exception occured");
			
			
		}
		
		
	}

}
