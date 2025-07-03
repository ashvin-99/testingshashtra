package ConditionalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledCommand
{
  public static void main(String[]args)
  {
	  System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
	
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
	//	System.out.println("Display Status:"+searchbox.isDisplayed());
		System.out.println("Enable Status:"+searchbox.isEnabled());  
		
		
		driver.close();
  }
}
