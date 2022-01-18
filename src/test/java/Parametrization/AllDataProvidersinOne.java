package Parametrization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class AllDataProvidersinOne {
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] data =null;
		
		if (m.getName().equals("doLogin")){
		
		data = new Object [2][2];
		
		data[0][0]= "mine@gmail.com";
		data[0][1]= "hgfshdkf";
		
		data[1][0]= "kick@gmail.com";
		data[1][1]= "hgshdkf";
		}
		else if (m.getName().equals("userReg")){
			data = new Object [2][3];
			
			data[0][0]= "mine@gmail.com";
			data[0][1]= "hgfshdkf";
			data[0][2]="mine";
			
			data[1][0]= "kick@gmail.com";
			data[1][1]= "hgshdkf";
			data[1][2]="kick";
		}
		
		return data;
		
	}


}
