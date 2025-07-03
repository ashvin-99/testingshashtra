package WebDriverWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWaitExample {
	//D:\Drivers\chromedriver-win64
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      WebDriverWait w1=new WebDriverWait(driver,10);
		  driver.get("http://saucedemo.com/");
		  driver.manage().window().maximize();
		  WebElement a1=(WebElement) w1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("user-name")));
		  a1.sendKeys("standard_user");
		  WebElement b1=(WebElement) w1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
		  b1.sendKeys("secret_sauce");
		 // driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  //driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click();
		  
		  
		  driver.quit();
	}

}
