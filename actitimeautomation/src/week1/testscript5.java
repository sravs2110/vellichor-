package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testscript5 
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


		
		
		
		
		WebElement r1=ff.findElement(By.name("users"));
		Select s1=new Select(r1);
		for(int i=0;i<=(s1.getOptions().size())-1;i++)
		{
			s1.selectByIndex(i);
		}
		s1.deselectAll();
		for(int i=0;i<=(s1.getOptions().size())-1;i++)
		{
			s1.selectByIndex(i);
		}
		for(int j=(s1.getOptions().size())-1;j>=0;j--)
		{
			s1.deselectByIndex(j);
		}
		for(int k=0;k<=(s1.getOptions().size())-1;k++)
		{
			if(k%2==0)
			{
				s1.selectByIndex(k);
			}
		}
		s1.deselectAll();
		ff.findElement(By.className("logoutImg")).click();
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	


