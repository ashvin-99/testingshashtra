package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CursorActions {

	public static void main(String[] args) 
	{
    //System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement drp=driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));

		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(drp).click().build().perform();
		
		
		
		
		
		
		
	}

}
