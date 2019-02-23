package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomerValidation
{

	public static void main(String[] args)
	{
		String customername=ExcelOperation.readData("Sheet2",1,1);
		String url=ExcelOperation.readData("Sheet1",2,0);
		String username=ExcelOperation.readData("Sheet1",2,1);
		String password=ExcelOperation.readData("Sheet1",2,2);
		String expectedresult=ExcelOperation.readData("Sheet2",1,2);
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
		ExcelOperation.writeData("Sheet2", 1, 3, actualreslt);
		if(expectedresult.equals(actualreslt))
		{
			ExcelOperation.writeData("Sheet2", 1, 4, "pass");
		}
		else
		{
			ExcelOperation.writeData("Sheet2", 1, 4, "fail");
		}
		
		
		
		

	}

}
