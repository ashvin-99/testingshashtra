package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//--------------- Scroll down by Pixels----------------------------------------
		
	//	js.executeScript("window.scrollBy(0,3000)");
	//	System.out.println(js.executeScript("return window.pageYOffset;"));
		
//-------------- Scroll down the Page till the element is preset---------------
		
	//	WebElement mg=driver.findElement(By.xpath("//a[normalize-space()='nopCommerce new release!']"));
    //    js.executeScript("arguments[0].scrollIntoView();", mg);
        
//-------------- Scroll down the Page till end of the page---------------
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		
		
	}

}
