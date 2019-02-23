package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testscript3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Projects & Customers")).click();
		WebElement r1=ff.findElement(By.name("selectedCustomer"));//selecting dropdown
		Select s1=new Select(r1);
		s1.selectByIndex(1);
		ff.findElement(By.linkText("add project")).click();
		ff.findElement(By.name("name")).sendKeys("selenium");
		ff.findElement(By.name("createProjectSubmit")).click();
		ff.findElement(By.className("logoutImg")).click();
		
		
		
		

		
	}

}
