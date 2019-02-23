package pack4;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(FrameWorkListner.class)
abstract public class SuperTestScript 
{
	public static WebDriver driver;
	String browser = ExcelOperations.readDta("preconfig", 1, 0);
	String url = ExcelOperations.readDta("preconfig", 1, 1);
	@BeforeTest
	public  void preConfig()
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",  ".\\RESOURCES\\DRIVERS\\geckodriver.exe");
			driver= new FirefoxDriver();
					
					}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",  ".\\RESOURCES\\DRIVERS\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
	@AfterTest
	public void postConfig()
	{
		driver.close();
	}
}


	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		