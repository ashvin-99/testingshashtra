package DropDownHandling;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectTagDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("https://testautomationpractice.blogspot.com/");
	      driver.manage().window().maximize();
	      
	      WebElement a1=driver.findElement(By.id("country"));
	      
	      //------ When select tag is Present------------------
	      
	      Select s1=new Select(a1);
	      
	   //   s1.selectByIndex(5);
	    //  s1.selectByVisibleText("China");
	    //  s1.selectByValue("japan");
	     
	      //-------- Total no.of options present in DropDown
	      
	    List<WebElement> options= s1.getOptions();
	     System.out.println(options.size());
	     
	     //----------- Print options in Console Window
	      for(int i=0;i<options.size();i++)
	      {
	    	  System.out.println(options.get(i).getText());
	      }
	      
	      
	      
	      driver.quit();
	}

}
