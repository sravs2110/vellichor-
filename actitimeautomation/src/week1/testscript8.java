package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript8 {

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
		ff.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		ff.findElement(By.name("name")).sendKeys("varsha");
		ff.findElement(By.linkText("Completed Tasks")).click();
		String s=ff.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
		System.out.println(s);
		ff.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
		ff.findElement(By.className("logoutImg")).click();
		ff.close();
		
		
		
		
		
		
		
		
		
		

	}

}
