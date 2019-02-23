package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");

FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.facebook.com/");
		ff.findElement(By.id("email")).sendKeys("sravs2110@gmail.com");
		ff.findElement(By.name("pass")).sendKeys("$sravs08678*");
		ff.findElement(By.id("u_0_2")).click();
		ff.findElement(By.className("_552h")).sendKeys("hi how r u?");
		
		
		
		

	}

}
