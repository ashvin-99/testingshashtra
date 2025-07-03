package com.testingshashtra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestions {

	public static void main(String[] args) {
		
	//	ChromeOptions option=new ChromeOptions();
	//	option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	    driver.manage().window().maximize();  
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");

//============= Print total no.of Auto Suggestions
		
		List<WebElement> Elements=driver.findElements(By.xpath("//div[@class='mkHrUc']//li"));
		System.out.println("No.of Elements:"+Elements.size());
		
//============== Print total Auto Suggestions ----------------------------
		/*
		for(int i=0;i<Elements.size();i++)
		{
			System.out.println(Elements.get(i).getText());
		}
		*/
//============= Select an option from list -------------------------------
		
		for(int i=0;i<Elements.size();i++)
		{
			String text=Elements.get(i).getText();
			if(text.equals("selenium webdriver"))
			{
				Elements.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		driver.quit();
		

	}

}
