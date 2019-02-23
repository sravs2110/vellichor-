package pack3;

import org.testng.annotations.Test;

public class CreateCustomerTC02 extends SuperTestScript
{
	@Test
	public void testCreateCustomerTC02() 
	{
		String username=TestngExcelOperation.readData("TC02",1,0);
		String password =TestngExcelOperation.readData("TC02",1,1);
		String customername=TestngExcelOperation.readData("TC02",1,2);
		String expectedResult=TestngExcelOperation.readData("TC02",1,3);
		LoginPage lp=new LoginPage();
		OpenTask otp=new OpenTask();
		ActiveProjectsAndCustomers apc =new ActiveProjectsAndCustomers();
		AddNewCustomer anc=new AddNewCustomer();
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLogin();
		otp.clickOnProjectsandCustomers();
		apc.addNewCustomer();
		anc.enterCustomerName(customername);
		anc.clickOnCreateCustomer();
	String actualResult	=apc.retrieveText();
	otp.clickOnLogout();
	String status=ValidationOperations.verify(expectedResult,actualResult);
	TestngExcelOperation.writeData("TC02",1,4,actualResult);
	TestngExcelOperation.writeData("TC02",1,5,status);
		
		
	}
	
	}


