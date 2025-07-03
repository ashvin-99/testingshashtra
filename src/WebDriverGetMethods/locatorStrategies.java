package WebDriverGetMethods;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class locatorStrategies {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
	      WebDriver driver=new ChromeDriver(option);
	      
	 //   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();  
	    
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("login-button"));
		
		List<WebElement> s1= driver.findElements(By.xpath("//a"));
		System.out.println(s1.size());
		
		driver.quit();
	}

}
