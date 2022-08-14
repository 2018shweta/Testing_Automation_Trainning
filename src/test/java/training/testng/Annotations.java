package training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Annotations {

	@BeforeClass
	public void setUp() {
		System.out.println("before class stUp");
	}

	@Test
	public void firstTest() {
		System.out.println("this is  the first test method...");
	}

	@Test
	public void secondTest() {
		System.out.println("this is  the second test method...");
	}

	@Test
	public void thirdTest() {
		System.out.println("this is  the third test method...");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is  the Before  method...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is  the after  method...");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("after class tearDown");
	}

}
