package training.testng.Asserts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUseBM {

	SoftAssert sf;
	
	@BeforeMethod
	void ob1()
	{
		sf = new SoftAssert();
	}
	
	
	@Test
	public void userbm()
	{
	
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
	@Test
	public void userbm2()
	{
		String firstname="shweta";
		String lastname="patel";
		int mo=12345;
		String address="At-Limla";
		
		sf.assertEquals("shweta", firstname);
		sf.assertEquals("patel", lastname);
        sf.assertEquals("At-Limla", address);
        sf.assertEquals(12345, mo);
        sf.assertAll();
		
		
	}
	
}
