package JavaScriptExecutorUses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//----------------------- name--------------------------------
		/*
		WebElement a1=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','john')", a1);
		*/
//----------------------- Radio button------------------------
		/*
		WebElement b1=driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()", b1);
		*/
//----------------------- CheckBox------------------------
		WebElement checkbox=driver.findElement(By.id("sunday"));
			js.executeScript("arguments[0].click()", checkbox);
		
		
		
		driver.quit();
		
	}

}
