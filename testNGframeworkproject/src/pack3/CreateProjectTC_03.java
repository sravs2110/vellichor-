package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pack3.TestngExcelOperation;

public class CreateProjectTC_03
{
	@Test
	public void testCreateProjectTC_03()
	{
	String customername=TestngExcelOperation.readData("TC_03",1,7);
	String url=TestngExcelOperation.readData("TC_03",1,0);
	String username=TestngExcelOperation.readData("TC_03",1,1);
	String password=TestngExcelOperation.readData("TC_03",1,2);
	String expectedresult=TestngExcelOperation.readData("TC_03",1,4);
	String projectname=TestngExcelOperation.readData("TC_03",1,3);
	
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ff.findElement(By.name("username")).sendKeys(username);
	ff.findElement(By.name("pwd")).sendKeys(password);
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	ff.findElement(By.linkText("Projects & Customers")).click();
	ff.findElement(By.xpath("//input[@value='Add New Project']")).click();
WebElement wb=ff.findElement(By.name("customerId"));
Select s=new Select(wb);
s.selectByVisibleText(customername);
	
	
	

	ff.findElement(By.name("name")).sendKeys(projectname+Keys.ENTER);
	
	
	
	String actualreslt=ff.findElement(By.className("successmsg")).getText();
	TestngExcelOperation.writeData("TC_03", 1, 5, actualreslt);
	if(expectedresult.equals(actualreslt))
	{
		TestngExcelOperation.writeData("TC_03", 1, 6, "pass");
	}
	else
	{
		TestngExcelOperation.writeData("TC_03", 1, 6, "fail");
	}
}


}
