package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript9 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("file:///D:/parent.html");
		ff.findElement(By.id("text1")).sendKeys("abc");
		ff.switchTo().frame("fr");
		ff.findElement(By.id("t1")).click();
		
		

	}

}
