package DropDownHandling;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionsDropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
     
   //------- enter Selenium inside Searchbox
        driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Selenium");
   //------- getting total no.of AutoSuggestions present on dom
        List<WebElement> l1=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
        System.out.println(l1.size());
        
  //------- Getting all Autosuggestions after entering 
        /*
        for(int i=0;i<l1.size();i++)
        {
        	//String s1=l1.get(i).getText();
        	System.out.println(s1);
        }
        */
  //------- to select specific Autosuggestion   
        for(int j=0;j<l1.size();j++)
        {
        	String s1=l1.get(j).getText();
        	if(s1.equals("selenium testing"))
        	{
        		l1.get(j).click();
        		break;
        	}

        }
        
	}
}
