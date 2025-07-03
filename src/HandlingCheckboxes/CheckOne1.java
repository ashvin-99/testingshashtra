package HandlingCheckboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOne1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	  //-------------- to select specific element  -----------------
	    driver.findElement(By.id("sunday")).click();
	    
	 //--------------- to select no.of checkboxes  -----------------
	   List<WebElement> s1=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
	    System.out.println(s1.size());
	   driver.quit();
	    
	}

}
