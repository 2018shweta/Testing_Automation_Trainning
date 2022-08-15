package training.testng.Asserts;

import org.testng.annotations.Test;

public class ParrelelExecution {

	@Test
	public void test1()
	{
		System.out.println("parelelethread thead id is"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("parelelethread thead id is"+Thread.currentThread().getId());
	}
	@Test
	public void test3()
	{
		System.out.println("parelelethread thead id is"+Thread.currentThread().getId());
	}
	@Test
	public void test4()
	{
		System.out.println("parelelethread thead id is"+Thread.currentThread().getId());
	}
}
