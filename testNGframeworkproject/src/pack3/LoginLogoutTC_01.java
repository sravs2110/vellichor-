package pack3;

import org.testng.annotations.Test;

public class LoginLogoutTC_01  extends SuperTestScript
{
	@Test
	public void testLoginLogoutTC_01()
	{
		String username=TestngExcelOperation.readData("TC01",1,0);
		String password =TestngExcelOperation.readData("TC01",1,1);
		String expectedResult=TestngExcelOperation.readData("TC01", 1, 2);
		LoginPage lp=new LoginPage();
		OpenTask otp=new OpenTask();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLogin();
        
		String actualResult =otp.retrieveTitleOfPage();
		otp.clickOnLogout();
		String status=ValidationOperations.verify(expectedResult,actualResult);
		TestngExcelOperation.writeData("TC01",1,3,actualResult);
		TestngExcelOperation.writeData("TC01",1,4,status);
		 
		
		
		
	}

}
