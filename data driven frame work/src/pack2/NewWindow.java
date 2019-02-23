package pack2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Reports")).click();
		ff.findElement(By.xpath("//td[@valign='middle']")).click();
		Set<String> s1=ff.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String s2=i1.next();
		String s3=i1.next();
		ff.switchTo().window(s3);
		WebElement rv1=ff.findElement(By.name("month"));
		Select s4=new Select(rv1);
		s4.selectByVisibleText("June");
		WebElement rv2=ff.findElement(By.name("year"));
		Select s5=new Select(rv1);
		s5.selectByIndex(2);
		
		
		
		
		
	}

}
