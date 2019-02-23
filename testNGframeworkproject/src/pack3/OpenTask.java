package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTask 
{
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsAndCustomersButton;
	
	public OpenTask()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnProjectsandCustomers()
	{
		projectsAndCustomersButton.click();
		
	}
	public String retrieveTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
	}
	public void clickOnLogout()
	{
		logoutButton.click();
	}

}
