package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsAndCustomers
{
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	public ProjectsAndCustomers()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public String retrieveTitle() 
	{
	 return SuperTestScript.driver.getText();
	}
	public void clickOnLogout()
	{
		logoutButton.click();
	}

}
