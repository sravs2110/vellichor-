package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadriven7 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("D:\\test data\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String url=w1.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(url);
		String un=w1.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String password=w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get(url);
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys(un);
		ff.findElement(By.name("pwd")).sendKeys(password);
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Projects & Customers")).click();
		ff.findElement(By.linkText("sravanthi")).click();
		ff.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		Alert rv1=ff.switchTo().alert();
		String s	=rv1.getText();
		System.out.println(s);
		rv1.dismiss();
		ff.findElement(By.className("logoutImg")).click();

	}

}
