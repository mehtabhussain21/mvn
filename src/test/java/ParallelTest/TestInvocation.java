package ParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestInvocation {
	
	
	@Test(invocationCount=5,threadPoolSize=4)
	public void executeTest() {
		System.out.println("RoomSoom admin");
		System.setProperty("webdriver.gecko.driver", "C:\\Java Tutorials\\P4_Selenium_Java_WD_B1\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://roomsoom.com/newadmin/");
		driver.quit();
	}

}
