package AlertsAndPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthonticatedPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();  
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		if(text.contains("Congratulations"))
		{
			System.out.println("Test Login Passed:");
		}
		else
		{
			System.out.println("Test Login Failed:");
		}

	}

}
