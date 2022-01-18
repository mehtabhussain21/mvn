package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_TC extends BaseTest{
	
	@Test(groups="Smoke")
	public void UserRegister() {
		System.out.println("User registering");
	}
	
	@Test(priority=1, groups="Function")
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
