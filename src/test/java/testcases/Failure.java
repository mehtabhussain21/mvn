package testcases;

import org.testng.Assert;

public class Failure {
	//related to triggers(set of code fired if an event happens)[event: passed tc, failed tc,skip tc]
	
	public void doLogin() {
		System.out.println("TC Failed");
		Assert.fail();
	}

}
