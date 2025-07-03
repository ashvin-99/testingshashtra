import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

        
        Set<String> s1=driver.getWindowHandles();
        List<String> windowList=new ArrayList(s1);
        String parentWindowId=windowList.get(0);
        String childWindowId=windowList.get(1);
        
 //--------------------- Switch to child window ---------------------------------
        driver.switchTo().window(childWindowId);
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
      //--------------------- Switch to Parent window ---------------------------------
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
	}
}
