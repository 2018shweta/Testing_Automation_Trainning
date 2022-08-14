package training.testng.Asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void Logintest()
	{
		
		SoftAssert sf=new SoftAssert();
		String firstname="shweta";
		String lastname="patel";
		int mo=12345;
		String address="At-Limla";
		
		sf.assertEquals("shwetaf", firstname);
		sf.assertEquals("patel", lastname);
        sf.assertEquals("At-Limla", address);
        sf.assertEquals(123456, mo);
        sf.assertAll();
		
		
	}
	
	
	
	
}
