package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		WebElement minslider=driver.findElement(By.xpath("//span[1]"));
		System.out.println(minslider.getLocation());    // (68, 255)
		
		act.dragAndDropBy(minslider, 100, 255).build().perform();
		System.out.println(minslider.getLocation());
		
		WebElement maxslider=driver.findElement(By.xpath("//span[2]"));
		System.out.println(maxslider.getLocation());   // (612,251)
		
		 act.dragAndDropBy(maxslider, -96, 255).build().perform();
		 System.out.println(maxslider.getLocation());
		 
	}

}
