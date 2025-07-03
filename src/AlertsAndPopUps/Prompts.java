package AlertsAndPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prompts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();  
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert s1=driver.switchTo().alert();
        System.out.println(s1.getText());
        s1.sendKeys("Ashvin");
        s1.accept();
        
	}

}
