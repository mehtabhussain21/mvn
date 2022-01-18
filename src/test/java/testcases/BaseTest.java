package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void setUp() {
		
	System.out.println("Conn is established");
	}
	
	@AfterSuite
	public void closure() {
		
		System.out.println("closing the conn");
	}
}
