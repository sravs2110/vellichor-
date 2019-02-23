package pack3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 
{
	@Parameters("t1")
	@Test
	public void testSample1(int i)
	{
		System.out.println("test sample 1 s executed"+i);
	}
	

}
