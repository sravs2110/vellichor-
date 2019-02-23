package pack4;

import org.testng.annotations.Test;

public class CreateGroupTC_02 extends SuperTestScript
{
	@Test
	public void testCreateGroupTC_02()
	{
		String username=ExcelOperations.readDta("TC_02", 1, 0);
		String password=ExcelOperations.readDta("TC_02", 1, 1);
		String groupname=ExcelOperations.readDta("TC_02", 1, 2);
		String expectedResult=ExcelOperations.readDta("TC_02", 1, 3);
		LoginPage lp=new LoginPage();
		SetupPage sp=new SetupPage();
		UserCardPage ucp= new UserCardPage();
		DolibarrPage dp=new DolibarrPage();
		GroupCard gc=new GroupCard();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnConnecton();
		sp.clickOnUsersAndGroupsLink();
		gc.clickOnNewGroupLink();
		
		gc.enterGroupName(groupname);
		gc.clickOnCreateButton();
		
		String actualResult=gc.retrieveTitle();
		dp.clockOnLogout();
		String status=ValidationOperations.verify(expectedResult,actualResult);
		ExcelOperations.writeData("TC_02", 1, 4, actualResult);
		ExcelOperations.writeData("TC_02", 1, 5, status);
		
		
		
		
	}
	

}
