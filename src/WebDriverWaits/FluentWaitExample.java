package WebDriverWaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
			FluentWait mywait=new FluentWait(driver);
			mywait.withTimeout(Duration.ofSeconds(30));
			mywait.pollingEvery(Duration.ofSeconds(5));
			mywait.ignoring(NoSuchElementException.class);
			
			driver.get("http://saucedemo.com/");
			driver.manage().window().maximize();

			
			WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			username.sendKeys("Admin");

	}

}
