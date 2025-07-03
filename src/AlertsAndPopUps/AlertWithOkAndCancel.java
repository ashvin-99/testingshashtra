package AlertsAndPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkAndCancel {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	    driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
//---------- Getting Text of Alert-----------
	//	Alert a1=driver.switchTo().alert();
	//	System.out.println(a1.getText());

	}

}
