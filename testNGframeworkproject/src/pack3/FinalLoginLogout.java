package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FinalLoginLogout extends SuperTestScript
{
@Test
public void testFinalLoginLogout()
{
	String url=TestngExcelOperation.readData("TC_01",1,0);

	String username=TestngExcelOperation.readData("TC_01",1,1);
	String password=TestngExcelOperation.readData("TC_01",1,2);
	String expectedresult=TestngExcelOperation.readData("TC_01",1,3);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String actualreslt=driver.getTitle();
	String status=ValidationOperations.verify(actualreslt, expectedresult);
	TestngExcelOperation.writeData("TC_01", 1, 5, status);
	TestngExcelOperation.writeData("TC_01", 1, 4,actualreslt);
	
}
		
		
		
		
		
		
		
		
		
		
		
	
}
