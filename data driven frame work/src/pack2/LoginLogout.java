package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout
{

	public static void main(String[] args)
	{
	String url=ExcelOperation.readData("Sheet1",2,0);

	String username=ExcelOperation.readData("Sheet1",2,1);
	String password=ExcelOperation.readData("Sheet1",2,2);
	
	
	String expectedresult=ExcelOperation.readData("Sheet1",2,3);
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ff.findElement(By.name("username")).sendKeys(username);
	ff.findElement(By.name("pwd")).sendKeys(password);
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	String actResult=ff.getTitle();
	System.out.println(actResult);
	ff.findElement(By.className("logoutImg")).click();
	ExcelOperation.writeData("Sheet1", 2, 4, actResult);
	
	}
}
	
	
	

	
	
	
			

	