package ParallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ViaDataProvider {
	
	@Test(dataProvider="getData")
	public void doLogin(String browser) throws InterruptedException {
		
		Date date = new Date();
		System.out.println("Browser is "+"---"+browser+"---"+date);
		Thread.sleep(2000);
	}
	
   @DataProvider(parallel=true)
	public Object[][] getData(){
		
		Object[][] d = new Object[2][1];
		d[0][0]= "Chrome";
		d[1][0]="firefox";
		
		return d;
	}
	
	
}
