package pack4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupCard
{
	@FindBy(linkText="New group")
	private WebElement newGroupLink;
	@FindBy(name="nom")
	private WebElement groupNameTextField;
	@FindBy(xpath="//input[@value='Create group']")
	private WebElement createGroupButton;
	@FindBy(id="user")
	private WebElement usersDropdown;
	@FindBy(xpath="//input[@value='Add']")
	private WebElement addButton;
	public GroupCard()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnNewGroupLink()
	{
		newGroupLink.click();
	}
	public void enterGroupName(String groupname)
	{
		groupNameTextField.sendKeys(groupname);
	}
	public void clickOnCreateButton()
	{
		createGroupButton.click();
	}
	public void clickOnAddButton()
	{
		addButton.click();
	}
	
	public void selectUserFromDropdown(int indexNum)
	{
	CommonLibrary.selectDropdownByIndex(usersDropdown, indexNum);
	}
	public String retrieveTitle()
	{
		return SuperTestScript.driver.getTitle();
		
	}
	

}
