package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testscript7 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Projects & Customers")).click();
		ff.findElement(By.linkText("manas")).click();
		ff.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		Alert rv1=ff.switchTo().alert();
		String s	=rv1.getText();
		System.out.println(s);
		rv1.dismiss();
		ff.findElement(By.className("logoutImg")).click();
		
		
		
		
		
		
		

	}

}
