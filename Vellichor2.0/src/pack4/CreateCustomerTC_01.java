package pack4;

import org.testng.annotations.Test;

public class CreateCustomerTC_01 extends SuperTestScript
{
	
@Test
public void testCreateCustomeTC_01()
{
	String username=ExcelOperations.readDta("TC_01", 1, 0);
	String password=ExcelOperations.readDta("TC_01", 1, 1);
	String loginname=ExcelOperations.readDta("TC_01", 1, 2);
	String lastname=ExcelOperations.readDta("TC_01", 1, 3);
	String customername=ExcelOperations.readDta("TC_01", 1, 4);
	String mobilenumber=ExcelOperations.readDta("TC_01", 1, 5);
	String email=ExcelOperations.readDta("TC_01", 1, 6);
	String expectedResult=ExcelOperations.readDta("TC_01", 1, 7);
	LoginPage lp=new LoginPage();
	SetupPage sp=new SetupPage();
	UserCardPage ucp= new UserCardPage();
	DolibarrPage dp=new DolibarrPage();
	lp.enterUsername(username);
	lp.enterPassword(password);
	lp.clickOnConnecton();
	sp.clickOnUsersAndGroupsLink();
	dp.clickOnNewUserLink();
	ucp.enterLastname(lastname);
	ucp.enterName(customername);
	ucp.enterLogin(loginname);
	
	ucp.enterMobileNumbwe(mobilenumber);
	ucp.enterEmail(email);
	ucp.clickOnCreate();
	
	String actualResult=dp.retrieveTitleOfPage();
	dp.clockOnLogout();
	String status=ValidationOperations.verify(expectedResult,actualResult);
	ExcelOperations.writeData("TC_01", 1, 8, actualResult);
	ExcelOperations.writeData("TC_01", 1, 9, status);
}

}
