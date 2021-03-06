package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pack3.TestngExcelOperation;

public class DeleteCustomerTC_04 {
	@Test
	public void testDeleteCustomerTC_04()
	{
	String customername=TestngExcelOperation.readData("TC_04",1,3);
	String url=TestngExcelOperation.readData("TC_04",1,0);
	String username=TestngExcelOperation.readData("TC_04",1,1);
	String password=TestngExcelOperation.readData("TC_04",1,2);
	String expectedresult=TestngExcelOperation.readData("TC_04",1,4);
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ff.findElement(By.name("username")).sendKeys(username);
	ff.findElement(By.name("pwd")).sendKeys(password);
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	ff.findElement(By.linkText("Projects & Customers")).click();
	WebElement wb=ff.findElement(By.name("selectedCustomer"));
	Select s=new Select(wb);
	s.selectByVisibleText(customername);
	ff.findElement(By.xpath("//input[@value='  Show  ']")).click();
	ff.findElement(By.linkText(customername)).click();
	ff.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
	Alert rv1=ff.switchTo().alert();
	rv1.accept();
	String actualreslt=ff.findElement(By.className("successmsg")).getText();
TestngExcelOperation.writeData("TC_04", 1, 5, actualreslt);
	if(expectedresult.equals(actualreslt))
	{
		TestngExcelOperation.writeData("TC_04", 1, 6, "pass");
	}
	else
	{
		TestngExcelOperation.writeData("TC_04", 1, 6, "fail");
	}
	
	

}

}
