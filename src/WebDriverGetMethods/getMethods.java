package WebDriverGetMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getMethods
{
	public static void main(String[]args)
	{
		
	//System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("Title of WebPage:"+driver.getTitle());
	System.out.println("Current Url:"+driver.getCurrentUrl());
	System.out.println("Page Source:"+driver.getPageSource());
	System.out.println("Window Handle:"+driver.getWindowHandle());
	
	driver.quit();
}
}