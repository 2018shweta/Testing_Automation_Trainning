package training.testng.Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testTimeOut {

	@Test(timeOut = 2000)//time provided in which a test should be completed
	public void timeoutExample() throws InterruptedException {
		Thread.sleep(1000);//working
		//Thread.sleep(5000);//not working beause timeout
		Assert.assertTrue(true);
	}
	
	
	
}
