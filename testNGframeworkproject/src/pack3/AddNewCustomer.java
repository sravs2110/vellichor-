package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddNewCustomer 
{
	@FindBy(xpath="//input[@name='name']")
	private WebElement customerNameTextField;
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createCustomerButton;
	public AddNewCustomer()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
		
	}
	public void enterCustomerName(String customername)
	{
		customerNameTextField.sendKeys(customername);
	}
	public void clickOnCreateCustomer()
	{
		createCustomerButton.click();
	}
	
	

}
