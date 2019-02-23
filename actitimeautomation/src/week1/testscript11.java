package week1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscript11
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("file:///D:/javaprograms/test11.html");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> rv1=ff.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<=rv1.size()-1;i++)
	{
		rv1.get(i).click();

	}
}
}
