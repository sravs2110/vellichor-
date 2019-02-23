package pack4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DolibarrPage
{
	@FindBy(linkText="New user")
	private WebElement newUserLink;
	@FindBy(linkText="New group")
	private WebElement newGroupLink;
	@FindBy(linkText="Groups")
	private WebElement groupsLink;
	@FindBy(linkText="selenium")
	private WebElement groupName;
	@FindBy(xpath="//*[@id='mainbody']/div[2]/table/tbody/tr/td[2]/a/img")
	private WebElement logoutButton;
	public DolibarrPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnNewUserLink()
	{
		newUserLink.click();
	}
	public String retrieveTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
		
	}
	public void clickOnGroupsLink()
	{
		groupsLink.click();
	}
	public void clickOnNewGroupLin()
	{
		newGroupLink.click();
	}
	public void clockOnLogout()
	{
		logoutButton.click();
	}
	public void clickOnGroupName()
	{
		groupName.click();
	}
}
