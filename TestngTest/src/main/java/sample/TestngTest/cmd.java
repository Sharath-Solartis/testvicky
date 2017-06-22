package sample.TestngTest;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class cmd 
{
	@Parameters("output")
	@Test 
	public void runcmd(String output)
		{
			System.out.println(System.getProperty("output"));
			System.out.println(output);
		}
	
}
