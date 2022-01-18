package mvn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {
	
	
	public static WebDriver driver = new FirefoxDriver();
		
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mehta\\Desktop\\Automation\\Drivers for Selenium\\geckodriver.exe");
		
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("mehtab.hussain174@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mehtab123");
		
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
