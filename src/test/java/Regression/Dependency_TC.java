package Regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_TC {
	
	@Test(priority=1)
	public void UserRegister() {
		System.out.println("User registering");
		Assert.fail("Failing");
	}
	
	@Test(priority=2,dependsOnMethods="UserRegister")
	public void loginUser() {
		System.out.println("Login User");
	}
	
	@Test(priority=3,dependsOnMethods="UserRegister",alwaysRun=true)
	public void thirdTC() {
		System.out.println("Third TC");
	}

}
