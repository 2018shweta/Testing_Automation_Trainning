package training.testng.Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts1 {

	
	@Test
	public void testmethod()
	{
		boolean isLogedIn=false;
		String LongText="log in";
		Assert.assertEquals("log in", LongText);
		Assert.assertTrue(isLogedIn, "done when both true ");
		
	}
}
