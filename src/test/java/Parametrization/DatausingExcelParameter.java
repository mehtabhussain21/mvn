package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatausingExcelParameter {
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password, String is_correct) {
		
		System.out.println(username+"--"+password+"--"+is_correct);
	}
	
	
	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data = new Object[2][3];
		
		return data;
		
	}

}
