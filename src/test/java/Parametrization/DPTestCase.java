package Parametrization;

import org.testng.annotations.Test;

public class DPTestCase {
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void doLogin(String username, String password){
		
		System.out.println(username+"--"+password);
	}
	
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp2")
	public void userReg(String fname, String lname, String email){
		System.out.println(fname+"--"+lname+"--"+email);
	}

}
