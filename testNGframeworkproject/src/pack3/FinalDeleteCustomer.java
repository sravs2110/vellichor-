package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FinalDeleteCustomer extends SuperTestScript
{
	@Test
	public void testFinalDeleteCustomer()
	{
		String customername=TestngExcelOperation.readData("TC_04",1,3);
		String url=TestngExcelOperation.readData("TC_04",1,0);
		String username=TestngExcelOperation.readData("TC_04",1,1);
		String password=TestngExcelOperation.readData("TC_04",1,2);
		String expectedresult=TestngExcelOperation.readData("TC_04",1,4);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		WebElement wb=driver.findElement(By.name("selectedCustomer"));
		Select s=new Select(wb);
		s.selectByVisibleText(customername);
		driver.findElement(By.xpath("//input[@value='  Show  ']")).click();
		driver.findElement(By.linkText(customername)).click();
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		Alert rv1=driver.switchTo().alert();
		rv1.accept();
		String actualreslt=driver.findElement(By.className("successmsg")).getText();
		String status=ValidationOperations.verify(actualreslt, expectedresult);
		TestngExcelOperation.writeData("TC_04", 1, 6, status);
		TestngExcelOperation.writeData("TC_04", 1, 5,actualreslt);
	}

}
