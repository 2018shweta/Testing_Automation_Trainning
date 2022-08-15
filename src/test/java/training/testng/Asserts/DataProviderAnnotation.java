package training.testng.Asserts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	@DataProvider(name="data1")
	private Object[][] depm1(){
		return new Object[][] {
			{"jay"},{"shweta"}
		};
	}
	
	
	
	@Test(dataProvider = "data1")
	public void dataProvider(String val)
	{
		System.out.println("parametre value:"+val);
	}
	
	
	
	
	
	
	
}
