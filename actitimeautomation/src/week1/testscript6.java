package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript6 {

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
		ff.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
		Alert rv1=ff.switchTo().alert();//javascript popup //we cannot create Alert class object because in Alert class constructor is private
	String s	=rv1.getText();//by using helper method alert() we will get the object of Alert class
	System.out.println(s);//alert class object cannot interact with popup because it doesn't have browser control
		rv1.accept();//so we are usong switchTo() method to give browser control to alert class object
		ff.findElement(By.className("logoutImg")).click();
		
		
		
		

	}

}
