package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pack3.TestngExcelOperation;

public class CreateCustomerTC_02
{
	@Test
	public void testCreateCustomerTC_02()
	{
	String customername=TestngExcelOperation.readData("TC_02",1,3);
	String url=TestngExcelOperation.readData("TC_02",1,0);
	String username=TestngExcelOperation.readData("TC_02",1,1);
	String password=TestngExcelOperation.readData("TC_02",1,2);
	String expectedresult=TestngExcelOperation.readData("TC_02",1,4);
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ff.findElement(By.name("username")).sendKeys(username);
	ff.findElement(By.name("pwd")).sendKeys(password);
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	ff.findElement(By.linkText("Projects & Customers")).click();
	ff.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	ff.findElement(By.xpath("//input[@type='text']")).sendKeys(customername);
	
	ff.findElement(By.name("createCustomerSubmit")).click(); 
	String actualreslt=ff.findElement(By.className("successmsg")).getText();
	TestngExcelOperation.writeData("TC_02", 1, 5, actualreslt);
	if(expectedresult.equals(actualreslt))
	{
		TestngExcelOperation.writeData("TC_02", 1, 6, "pass");
	}
	else
	{
		TestngExcelOperation.writeData("TC_02", 1, 6, "fail");
	}
	
	
	
	

}

}
