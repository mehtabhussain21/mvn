package ParallelTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parapllelTest {
	
	@Parameters({"browser"})
	@Test
	public void doLogin(String browser) throws InterruptedException {
		
		System.out.println("Browser is "+"---"+browser);
		Thread.sleep(2000);
	}

}
