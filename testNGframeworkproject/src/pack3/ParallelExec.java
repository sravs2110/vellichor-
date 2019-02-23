package pack3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec 
{
	String browser=TestngExcelOperation.readData("TC_05",1,0);
@Parameters("t1")
@Test
public void testParallelExec()
{
	if(browser.equals("firefox"))
			{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
			}
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\geckodriver.exe");
		ChromeDriver ff = new ChromeDriver();
		ff.get("http://desktop-96on0fm/login.do");
	}
		
	}


}
