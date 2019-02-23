package pack4;

import org.testng.Assert;

public class ValidationOperations 
{
	public static String verify(String actual,String expected)
	{
		try {
			Assert.assertEquals(actual, expected);
			return "pass";
		}
		catch(AssertionError e)
		{
			return "fail";
			
			
		}
	}

}
