package pack4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetupPage
{
	@FindBy(linkText="Users & Groups")
	private WebElement usersAndGroupsLink;
	public SetupPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
		
	}
	public void clickOnUsersAndGroupsLink()
	{
		usersAndGroupsLink.click();
	}
	

}

