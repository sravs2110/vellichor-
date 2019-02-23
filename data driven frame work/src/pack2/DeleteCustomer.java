package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteCustomer {

	public static void main(String[] args) 
	{
		String customername=ExcelOperation.readData("Sheet4",1,3);
		String url=ExcelOperation.readData("Sheet4",1,0);
		String username=ExcelOperation.readData("Sheet4",1,1);
		String password=ExcelOperation.readData("Sheet4",1,2);
		String expectedresult=ExcelOperation.readData("Sheet4",1,4);
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
		ExcelOperation.writeData("Sheet4", 1, 5, actualreslt);
		if(expectedresult.equals(actualreslt))
		{
			ExcelOperation.writeData("Sheet4", 1, 6, "pass");
		}
		else
		{
			ExcelOperation.writeData("Sheet4", 1, 6, "fail");
		}
		
		

	}

}
