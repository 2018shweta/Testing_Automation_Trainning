package training.testng.Asserts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	@Parameters({"env"})
	@Test
	public void parameterExam(@Optional("emvinbsjd") String env)
	{
		System.out.println("parameter value is"+env);
	}
	
	
	
	
	
	
	
}
