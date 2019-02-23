package pack3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.testng.annotations.Test;

public class DeleteCustomerTC5 extends SuperTestScript
{
	@Test
	public void testDeleteCustomerTC04()
	{
		String username=TestngExcelOperation.readData("TC04",1,0);
		String password =TestngExcelOperation.readData("TC04",1,1);
		String customername=TestngExcelOperation.readData("TC04",1,2);
		
		String expectedResult=TestngExcelOperation.readData("TC04",1,3);
		EditCustomerInformation eci=new EditCustomerInformation();
		LoginPage lp=new LoginPage();
		OpenTask otp=new OpenTask();
		ActiveProjectsAndCustomers apc =new ActiveProjectsAndCustomers();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLogin();
		otp.clickOnProjectsandCustomers();
		apc.clickOnDropdown(customername);
		apc.clickOnShowButton();
	
		eci.clickOnDeleteCustomer();
		CommonLibrary.clickOnOkButtonInPopup();
		String actualResult=apc.retrieveText();
		otp.clickOnLogout();
		String status=ValidationOperations.verify(expectedResult,actualResult);
		TestngExcelOperation.writeData("TC04",1,4,actualResult);
		TestngExcelOperation.writeData("TC04",1,5,status);
		
	}

}
