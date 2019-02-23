package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Users")).click();
		ff.findElement(By.xpath("//input[@type='button']")).click();
		ff.findElement(By.name("username")).sendKeys("divyasree");
		ff.findElement(By.name("firstName")).sendKeys("divya");
		ff.findElement(By.name("lastName")).sendKeys("t");
		ff.findElement(By.name("passwordText")).sendKeys("city@881");
		ff.findElement(By.name("passwordTextRetype")).sendKeys("city@881");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.className("logoutImg")).click();
		
		
	}

}
