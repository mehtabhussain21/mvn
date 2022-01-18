package AIClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mehta\\Desktop\\Automation\\Drivers for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div/div/form/div[3]/div[1]/div/p[3]/span/input")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		Select month_drp = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/select[1]")));
		month_drp.selectByVisibleText("Aug");
		Select year_drp = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/select[2]")));
		year_drp.selectByVisibleText("1991");
		String date = "15";
		List<WebElement> alldates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		for(WebElement ele:alldates) {
			String dt =ele.getText();
			if(dt.equals(date)) {
				
				ele.click();
				break;
			}
			
		}
		driver.quit();
		
	}

}
