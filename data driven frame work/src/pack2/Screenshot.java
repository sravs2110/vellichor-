package pack2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://desktop-96on0fm/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EventFiringWebDriver efw = new EventFiringWebDriver(ff);
		File f = efw.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\Login.jpg");
		FileUtils.moveFile(f,f2);
		
		
		

	}

}
