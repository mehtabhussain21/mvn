package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class manualParametrization {
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password) {
		
		System.out.println(username+ "---"+ password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		//Object: super class of string, int, char
		//[no. of rows][no. of columns] *exclude the first heading line
		//DataProvider is a 2D array
		
		data[0][0]="mehtab@gmail.com";
		data[0][1]="meht123";
		data[1][0]="mehtab@gmail.com";
		data[1][1]="meht123";
		
		return data;
		
	}

}
