package com.testingshashtra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.testingshastra.com/dropdown-list-assignment/");
		
		WebElement a1=driver.findElement(By.xpath("//select[@class='single-select']"));
		Select s1=new Select(a1);
		
		s1.selectByVisibleText("June");

	}

}
