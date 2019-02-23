package pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProject 
{
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	@FindBy(name="name")
	private WebElement projectnameTextfield;
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	public AddNewProject()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void selectCustomerFromDropdown(String customername)
	{
		CommonLibrary.selectDropdownByVisibleText(customerDropdown, customername);		
	}
	public void enterProjectName(String projectname)
	{
		projectnameTextfield.sendKeys(projectname);
	}
	public void clickOnCreateProject()
	{
		createProjectButton.click();
	}
	

}
