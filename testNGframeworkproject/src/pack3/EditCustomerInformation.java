package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInformation
{
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteThisCustomer;
	public EditCustomerInformation()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnDeleteCustomer()
	{
		deleteThisCustomer.click();
	}
}
