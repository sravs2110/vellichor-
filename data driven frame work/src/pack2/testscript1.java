package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript1 {

	public static void main(String[] args) 
	{
		FileInputStream fis=new FileInputStream("D:\\test data\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String url=w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String un=w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pwd=w1.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get(url);
		Dimension d1=new Dimension(600, 600);
		ff.manage().window().setSize(d1);
	
				
				
				ff.manage().window().maximize();
				ff.findElement(By.id("un")).sendKeys(un);
				ff.findElement(By.name("pwd")).sendKeys(pwd);
				ff.findElement(By.id("un")).clear();
				ff.findElement(By.name("pwd")).clear();

				ff.findElement(By.id("un")).sendKeys("abc");
				ff.findElement(By.name("pwd")).sendKeys("abc");
				boolean b1=ff.findElement(By.className("login")).isEnabled();
				System.out.println(b1);
				

				ff.findElement(By.className("login")).click();
				ff.findElement(By.id("cb1")).isSelected();
				ff.findElement(By.className("female")).click();
				ff.findElement(By.linkText("actitime")).click();
				String s= ff.getTitle();
				System.out.println(s);
				ff.navigate().back();
				ff.navigate().forward();
				ff.navigate().refresh();
				ff.manage().deleteAllCookies();
	}
}

	}

}
