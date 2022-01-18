package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_TC extends BaseTest{
	
	@Test(priority=1,groups={"Function","Smoke"})
	public void UserRegister() {
		System.out.println("User registering");
		Assert.fail("Failing");
	}
	
	@Test(priority=2,dependsOnMethods="UserRegister",groups="Function")
	public void loginUser() {
		System.out.println("Login User");
	}
	
	@Test(priority=3,dependsOnMethods="UserRegister",alwaysRun=true,groups="Smoke")
	public void thirdTC() {
		System.out.println("Third TC");
	}

}
