package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActiveProjectsAndCustomers 
{
	@FindBy(className="successmsg")
	private WebElement successmsgText;
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerLink;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectLink;
	@FindBy(name="selectedCustomer")
	private WebElement activeCustomerDropdown;
	@FindBy(xpath="//input[@value='  Show  ']")
	private WebElement showButton;
	@FindBy(linkText="hghis")
	private WebElement hghisName;
	public ActiveProjectsAndCustomers()
	{
		PageFactory.initElements(SuperTestScript.driver,this );
	}
	
	public void addNewCustomer()
	{
		addNewCustomerLink.click();
		
	}
	public void clickOnAddNewProjectLink()
	{
		addNewProjectLink.click();
	}
	public String retrieveText() 
	{
	 return successmsgText.getText();
	}
	public void clickOnHghis()
	{
		hghisName.click();
	}
	public void clickOnShowButton()
	{
		showButton.click();
	}
	public void clickOnDropdown(String customername)
	{
		CommonLibrary.selectDropdownByVisibleText(activeCustomerDropdown, customername);
	}

}
