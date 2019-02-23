package pack4;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCardPage
{
	@FindBy(name="nom")
private WebElement lastNameTextField;
	@FindBy(name="prenom")
private WebElement nameTextField;
	@FindBy(name="login")
private WebElement loginTextField;
	@FindBy(name="email")
	private WebElement emailTextField;
	@FindBy(name="user_mobile")
	private WebElement mobileNumberTextField;
	@FindBy(xpath="//input[@value='Create user']")
	private WebElement createUserButton;
	public UserCardPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void enterLastname(String lastname)
	{
		lastNameTextField.sendKeys(lastname);
	}
	public void enterName(String customername)
	{
		nameTextField.sendKeys(customername);
	}
	public void enterLogin(String loginname)
	{
		loginTextField.sendKeys(loginname);
	}
	public void enterEmail(String email)
	{
		emailTextField.sendKeys(email);
		
	}
	public void enterMobileNumbwe(String mobilenumber) 
	{
		mobileNumberTextField.sendKeys(mobilenumber);
		
	}
	public void clickOnCreate()
	{
		createUserButton.click();
	}
	
		
	}
	
	
	
	
	
	
	