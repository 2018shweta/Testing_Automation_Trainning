package training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation2 {
  @Test
  public void f() {
  }
  
  
  
  
  @BeforeClass
	public void setUp() {
		System.out.println("before class stUp2");
	}

	@Test
	public void firstTest() {
		System.out.println("this is  the first2 test method...");
	}

	@Test
	public void secondTest() {
		System.out.println("this is  the second2 test method...");
	}
	@AfterClass
	public void tearDown() {
		System.out.println("after class tearDown2");
	}
}
