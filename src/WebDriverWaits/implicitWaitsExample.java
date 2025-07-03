package WebDriverWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitsExample {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
	  driver.get("http://saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
	  
	  driver.quit();
	}

}
