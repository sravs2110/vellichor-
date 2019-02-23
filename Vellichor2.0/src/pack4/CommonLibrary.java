package pack4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;



public class CommonLibrary 
{
	
	public static void selectDropdownByIndex(WebElement dropdownAddress,int indexNum)
	{
		Select s1= new Select(dropdownAddress);
		s1.selectByIndex(indexNum);
	}
	public static void selectDropdownByVisibleText(WebElement dropdownAddress,String visibleText)
	{
		Select s1=new Select(dropdownAddress);
		s1.selectByVisibleText(visibleText);
	}
	public static void selectDropdownByValue(WebElement dropdownAddress,String value)
	{
		Select s1=new Select(dropdownAddress);
		s1.selectByValue(value);
	}
	public static void clickOnOkButtonInPopup()
	{
		Alert a1= SuperTestScript.driver.switchTo().alert();
		a1.accept();
	}
	public static void clickOnCancelButtonInPopup()
	{
		Alert a1= SuperTestScript.driver.switchTo().alert();
		a1.dismiss();
	}
	public static String retrieveTextFromPopup()
	{
		Alert a1= SuperTestScript.driver.switchTo().alert();
		return a1.getText();
		
	
		
	}
	public static void takeScreenshot(String screenshotName) throws IOException
	{
		EventFiringWebDriver efw=new EventFiringWebDriver(SuperTestScript.driver);
		File f1= efw.getScreenshotAs(OutputType.FILE);
		File f2= new File("D:\\screenshots\\"+screenshotName+".jpg");
		FileUtils.moveFile(f1, f2);
		
	}
	
	
	
	
}
	
