package Regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_TC {
	
	@Test
	public void UserRegister() {
		System.out.println("User registering");
	}
	
	@Test(priority=1)
	public void loginUser() {
		System.out.println("Login User");
	}
	
	@BeforeTest
	public void CreateDBConn() {
		System.out.println("CReating DB conn");
	}

	@AfterTest
	public void CloseDBConn() {
		
		System.out.println("Closing DB Conn");
	}
	
	@BeforeMethod
	public void LaunchURL() {
		System.out.println("Launch URL");
	}
	
	@AfterMethod
	public void CloseURL() {
		System.out.println("Close URL");
	}
}
