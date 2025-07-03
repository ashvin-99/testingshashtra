package com.testingshashtra;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class simpledemo 
{
	WebDriver driver;
   @Test
	public void f1()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.goibibo.com/");
		 driver.manage().window().maximize();
		 
		 driver.quit();
		
	}
}
