package pack3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FinalCreateCustomer extends SuperTestScript
{
	@Test
	public void testFinalCreateCustomer()
	{
		String customername=TestngExcelOperation.readData("TC_05",1,4);
		
		String username=TestngExcelOperation.readData("TC_05",1,2);
		String password=TestngExcelOperation.readData("TC_05",1,3);
		String expectedresult=TestngExcelOperation.readData("TC_05",1,5);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(customername);
		driver.findElement(By.name("createCustomerSubmit")).click(); 
		String actualreslt=driver.findElement(By.className("successmsg")).getText();
		String status=ValidationOperations.verify(actualreslt, expectedresult);
		TestngExcelOperation.writeData("TC_05", 1, 7, status);
		TestngExcelOperation.writeData("TC_05", 1, 6,actualreslt);
	}

}
