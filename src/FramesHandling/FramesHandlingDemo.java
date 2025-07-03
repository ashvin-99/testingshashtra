package FramesHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingDemo {

	public static void main(String[]args) 
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("file:///Volumes/extra/Testing%20Shashtra/Assignments/FrameDemo/FrameDemo.html");
	        driver.manage().window().maximize();
   
	        
	}

}
