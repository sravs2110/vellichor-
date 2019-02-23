package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testscript10 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("file:///D:/javaprograms/parent1.html");
		ff.findElement(By.className("t1")).click();
		ff.switchTo().frame("un1");
		ff.findElement(By.id("un1")).sendKeys("abc");
		ff.switchTo().defaultContent();
		ff.findElement(By.id("cb1")).click();
		ff.switchTo().frame("un2");
		WebElement rv1=ff.findElement(By.id("01"));
		Select s1=new Select(rv1);
		s1.selectByVisibleText("selenium");
		ff.switchTo().defaultContent();
		ff.findElement(By.id("cb2")).click();
		ff.switchTo().frame("un3");
		ff.findElement(By.linkText("actitime")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
