package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			//	WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				WebElement a1=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//---------------- Perform Right Click----------------
				
			Actions rightclick=new Actions(driver);
				rightclick.contextClick(a1).perform();
				
//-----------------------------------------------------
				
			driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
			driver.switchTo().alert().accept();
			
			driver.quit();

	}

}
