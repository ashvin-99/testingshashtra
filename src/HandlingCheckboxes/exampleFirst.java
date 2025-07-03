package HandlingCheckboxes;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleFirst 
{
	public static void main(String[]args)
	{
		 System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	    driver.manage().window().maximize();  
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		
		//------------- Selecting specific one checkbox
	//	driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[1]/form/center/input[2]")).click();
		
		//------------- check weather checkbox selected or not 
	//	WebElement s1=driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[1]/form/center/input[25]"));
	//	System.out.println(s1.isSelected());
		
		//------------- // Total No.of checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("No.of checkBoxes:"+checkBoxes.size());
		
		// 1)  select all checkboxes
		
			/*	for(int i=0;i<checkBoxes.size();i++)
				{
					checkBoxes.get(i).click();
				}
				//-------------------------------------------------
		    */     
//------------2)  select all checkboxes
				
				/*for(WebElement a1:checkboxes)
				{
					a1.click();
				}
				*/
//------------3) select last 2 checkboxes
				
				for(int i=98;i<checkBoxes.size();i++)
				{
					checkBoxes.get(i).click();
				}
				
//------------4) select first 2 checkboxes
				/*
				  for(int i=0;i<checkBoxes.size();i++)
				{
					if(i<2)
					{
					checkBoxes.get(i).click();
					}
				}
				*/
// ------------5) Clear/unchecked checkboxes
				/*
				for(WebElement a1:checkBoxes)
				{
					a1.click();
				}
				for(WebElement a1:checkBoxes)
				{
					a1.click();
				}
				*/
				
				
				//driver.quit();
			


	}

}
