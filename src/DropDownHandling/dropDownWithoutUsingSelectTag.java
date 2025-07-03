package DropDownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDownWithoutUsingSelectTag {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	      
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//------------- Clicking on DropDown
		driver.findElement(By.xpath("//button")).click();
		List<WebElement> a1=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		
		//----------------------------------- find total no.of Options
		
			System.out.println("Total no.of Options:"+a1.size());
			
	//----------------------------------- Print all Options --------------------------------------------------
			
		/*	for(int i=0;i<a1.size();i++)
			{
				System.out.println(a1.get(i).getText());
			}
		*/
	//---------------------------- Select Specific option from dropdown------------------------------------------------
			
		/*	for(int i=0;i<a1.size();i++)
			{
				if(a1.get(i).getText().equals("Java"))
				{
					a1.get(i).click();
					break;
				}
			}
		*/
//--------------- Select multiple Options from dropdown------------------------------------------------
			
			/*
			for(int i=0;i<a1.size();i++)
			{
				String s1=a1.get(i).getText();
				if(s1.equals("Java") || s1.equals("Python") )
				{
					a1.get(i).click();
					
				}
			}
			*/
		
	}

}
