package pack4;

import org.testng.annotations.Test;

public class AssignUserToGroupTC_03 extends SuperTestScript
{
	@Test
	public void testAssignUserToGroupTC_03()
	{
		String username=ExcelOperations.readDta("TC_03", 1, 0);
		String password=ExcelOperations.readDta("TC_03", 1, 1);
		
		String expectedResult=ExcelOperations.readDta("TC_03", 1, 2);
		LoginPage lp=new LoginPage();
		SetupPage sp=new SetupPage();
		UserCardPage ucp= new UserCardPage();
		DolibarrPage dp=new DolibarrPage();
		GroupCard gc=new GroupCard();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnConnecton();
		sp.clickOnUsersAndGroupsLink();
		dp.clickOnGroupsLink();
		dp.clickOnGroupName();
		gc.selectUserFromDropdown(3);
		gc.clickOnAddButton();
		
		String actualResult=gc.retrieveTitle();
		dp.clockOnLogout();
		String status=ValidationOperations.verify(expectedResult,actualResult);
		ExcelOperations.writeData("TC_03", 1, 3, actualResult);
		ExcelOperations.writeData("TC_03", 1, 4, status);
	}

}
