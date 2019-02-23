package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class datadriven10 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("D:\\test data\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String url=w1.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(url);
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get(url);
		ff.findElement(By.className("t1")).click();
		ff.switchTo().frame("un1");
		ff.findElement(By.id("un1")).sendKeys("abc");
		ff.switchTo().defaultContent();
		ff.findElement(By.id("cb1")).click();
		ff.switchTo().frame("un2");
		WebElement rv1=ff.findElement(By.id("01"));
		Select s1=new Select(rv1);
		s1.selectByVisibleText("selenium");
		ff.switchTo().defaultContent();
		ff.findElement(By.id("cb2")).click();
		ff.switchTo().frame("un3");
		ff.findElement(By.linkText("actitime")).click();

	}

}
