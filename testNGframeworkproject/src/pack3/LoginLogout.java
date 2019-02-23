package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pack2.TestngExcelOperation;



public class LoginLogout {
	@Test
	public void testLoginLogout()
	{

	String url=TestngExcelOperation.readData("TC_01",1,0);

	String username=TestngExcelOperation.readData("TC_01",1,1);
	String password=TestngExcelOperation.readData("TC_01",1,2);
	
	
	String expectedresult=TestngExcelOperation.readData("TC_01",1,3);
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ff.findElement(By.name("username")).sendKeys(username);
	ff.findElement(By.name("pwd")).sendKeys(password);
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	String actResult=ff.getTitle();
	System.out.println(actResult);
	
	TestngExcelOperation.writeData("TC_01", 1, 4, actResult);
	if(expectedresult.equals(actResult))
	{
		TestngExcelOperation.writeData("TC_01", 1, 5, "pass");
	}
	else
	{
		TestngExcelOperation.writeData("TC_01", 1, 5, "fail");
	}

	}
}


