package week1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript1 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();//open browser
		ff.get("file:///D:/javaprograms/qspiders.html");//enter url
		Dimension d1=new Dimension(600, 600);//set size of browser with height and width
		ff.manage().window().setSize(d1);
	
				
				
				ff.manage().window().maximize();//maximize the browser
				ff.findElement(By.id("un")).sendKeys("abc");//enter un
				ff.findElement(By.name("pwd")).sendKeys("abc");//enter pwd
				ff.findElement(By.id("un")).clear();//clear un
				ff.findElement(By.name("pwd")).clear();//clear pwd

				ff.findElement(By.id("un")).sendKeys("abc");
				ff.findElement(By.name("pwd")).sendKeys("abc");
				boolean b1=ff.findElement(By.className("login")).isEnabled();//checking login enabled or not
				System.out.println(b1);
				

				ff.findElement(By.className("login")).click();//click on login
				ff.findElement(By.id("cb1")).isSelected();
				ff.findElement(By.className("female")).click();
				boolean b2=ff.findElement(By.linkText("actitime")).isDisplayed();
				System.out.println(b2);
				ff.findElement(By.linkText("actitime")).click();
				String s= ff.getTitle();
				System.out.println(s);
				ff.navigate().back();//back 
				ff.navigate().forward();//forward
				ff.navigate().refresh();//refresh
				ff.manage().deleteAllCookies();//delete all cookies
	}
}
				
				
				
				
				
				
				
	

				
				
				
				
				
				

