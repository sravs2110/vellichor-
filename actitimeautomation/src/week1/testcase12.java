package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class testcase12
{


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
		ff.findElement(By.xpath("//input[@value='Add New User']")).click();
		List<WebElement> rv1=ff.findElements(By.xpath("//input[@type='text']"));
		String[] name= {"sravan","sravan","s","av","sravs2110@gmail.com","9701391185","fax123","1234","5678"};
		for(int k=0;k<= rv1.size()-1;k++)
		{
			rv1.get(k).sendKeys(name[k]);
			
		}
		List<WebElement> rv2=ff.findElements(By.xpath("//input[@type='password']"));
		String[] name1= {"city@881","city@881"};
		for(int j=0;j<= rv2.size()-1;j++)
		{
			rv2.get(j).sendKeys(name1[j]);
			
		}
		List<WebElement> rv3=ff.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<= rv3.size()-1;i++)
		{
			rv3.get(i).click();
			
		}
		
		
		
			
	

		
	

	}
}

	
	


