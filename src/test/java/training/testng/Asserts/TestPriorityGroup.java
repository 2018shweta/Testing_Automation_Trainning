package training.testng.Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriorityGroup {

	@Test(priority = 1)
	public void createPatient()
	{
		System.out.println("patients");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2,dependsOnMethods = "createPatient",groups = "reg")
	public void updatePatient()
	{
		System.out.println("patients");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3,dependsOnMethods = "createPatient",groups = {"reg","block"})
	public void deletePatient()
	{
		System.out.println("patients");
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
}
