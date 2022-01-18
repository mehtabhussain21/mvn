package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationFromXML {
	
	@Parameters({"Browser","env"})
	@Test
	public void getBrowser(String Browser, String env){
		
		System.out.println(Browser+"--"+env);
	}

}
