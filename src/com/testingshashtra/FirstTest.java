package com.testingshashtra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
	//	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("TestingShastra");
	//	driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
       
//-------------- getCurrentUrl --------------------------------
		System.out.println(driver.getCurrentUrl());
//-------------- getTitle -------------------------------------
		System.out.println(driver.getTitle());
		
		
		
		 driver.close();
	}

}
