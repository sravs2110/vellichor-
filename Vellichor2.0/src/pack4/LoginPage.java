package pack4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	@FindBy(name="password")
	private WebElement passwordTextfield;
	@FindBy(className="button")
	private WebElement connectionButton;
	public LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void enterUsername(String username)
	{
		usernameTextfield.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		passwordTextfield.sendKeys(password);
	}
	public void clickOnConnecton()
	{
		connectionButton.click();
	}

}
