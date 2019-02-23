package pack3;

import org.testng.annotations.Test;

public class CreateProjectTC03 extends SuperTestScript
{
	@Test
	public void testCreatePojectTC03()
	{
		String username=TestngExcelOperation.readData("TC03",1,0);
		String password =TestngExcelOperation.readData("TC03",1,1);
		String customername=TestngExcelOperation.readData("TC03",1,2);
		String projectname=TestngExcelOperation.readData("TC03",1,3);
		String expectedResult=TestngExcelOperation.readData("TC03",1,4);
	
		LoginPage lp=new LoginPage();
		OpenTask otp=new OpenTask();
		ActiveProjectsAndCustomers apc =new ActiveProjectsAndCustomers();
		AddNewProject anp =new AddNewProject();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLogin();
		otp.clickOnProjectsandCustomers();
		apc.clickOnAddNewProjectLink();
		anp.selectCustomerFromDropdown(customername);
		anp.enterProjectName(projectname);
		anp.clickOnCreateProject();
		String actualResult= apc.retrieveText();
		otp.clickOnLogout();
		String status=ValidationOperations.verify(expectedResult,actualResult);
		TestngExcelOperation.writeData("TC03",1,5,actualResult);
		TestngExcelOperation.writeData("TC03",1,6,status);
		
	}

}
