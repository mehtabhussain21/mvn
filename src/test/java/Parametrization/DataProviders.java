package Parametrization;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="dp1")
	public static Object[][] getData(){
		
		Object[][] data = new Object [2][2];
		
		data[0][0]= "mine@gmail.com";
		data[0][1]= "hgfshdkf";
		
		data[1][0]= "kick@gmail.com";
		data[1][1]= "hgshdkf";
		
		return data;
		
	}
	
	@DataProvider(name="dp2")
	public static Object[][] getData2(){
		
		Object[][] data = new Object [2][3];
		
		data[0][0]= "mine@gmail.com";
		data[0][1]= "hgfshdkf";
		data[0][2]="mine";
		
		data[1][0]= "kick@gmail.com";
		data[1][1]= "hgshdkf";
		data[1][2]="kick";
		
		return data;
		
	}


}
