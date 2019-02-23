package pack3;

import org.testng.annotations.Test;

public class TestScript3 
{

	@Test(groups="functional")
	public void functionalTesting()
	{
		System.out.println("fn is executed");
	}
	@Test(groups="integration")
	
		public void integrationTesting()
	{
			System.out.println("it is executed");
		}

}
