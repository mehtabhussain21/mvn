package AIClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mehta\\Desktop\\Automation\\Drivers for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("mehtab");
		driver.findElement(By.id("lastName")).sendKeys("hussain");
		driver.findElement(By.id("userEmail")).sendKeys("mehtab123@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8998877667");
		//Date of Birth
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")).click();
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select select1 = new Select(year);
		select1.selectByVisibleText("1994");
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sc1 = new Select(month);
		sc1.selectByVisibleText("December");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[4]")).click();
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,5000)");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).click();
		for (int i=1; i<4; i++){
			driver.findElement(By.id("hobbies-checkbox-"+i+"")).click();
		}
        driver.findElement(By.id("currentAddress")).sendKeys("Pune Maharashtra");
        WebElement drop = driver.findElement(By.id("state"));
        Select select = new Select(drop);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select.selectByVisibleText("NCR");
        WebElement city = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[1]"));
        Select sc = new Select(city);
        sc.selectByVisibleText("Delhi");
        driver.findElement(By.id("submit")).click();
        
	}

	}

