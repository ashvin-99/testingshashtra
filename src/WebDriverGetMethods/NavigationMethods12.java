package WebDriverGetMethods;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods12 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	 //   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();  
	    
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.get("http://www.google.com");
		Thread.sleep(2000); 
		
		driver.navigate().back();
		Thread.sleep(2000); 
		
		driver.navigate().forward();
		Thread.sleep(2000); 
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();

		
		//driver.quit();
	}

}
