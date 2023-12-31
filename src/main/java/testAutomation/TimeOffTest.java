package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeOffTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Navaneeth H K\\Desktop\\Browser\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navaneeth H K\\Desktop\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(10000));
        	driver.get("https://so1.replicon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("CompanyNameTextBox")).sendKeys("navneeth1");
driver.findElement(By.id("NextButton")).click();
driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginNameTextBox"))).sendKeys("testuser1");
driver.findElement(By.id("PasswordTextBox")).sendKeys("Replicon@123");
driver.findElement(By.id("LoginButton")).click();
driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Replicon"))).click();
driver.findElement(By.linkText("Time Off")).click();
driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("book-timeoff-btn"))).click();
//driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timeOffSubmit"))).click();
	
	}

}
