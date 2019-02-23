package pack2;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Datadriven
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\test data\\userdata.xls");
		Workbook w1=WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet("sheet1");
		Row r1=s1.getRow(7);
		Cell c1 = r1.getCell(4);
		String data = c1.getStringCellValue();
		System.out.println(data);
		
		
		
		
	}

	

}
