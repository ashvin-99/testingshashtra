package AlertsAndPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
	 
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
	
	//----------------- When type="file" present--------------------------
		
	//	driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\HP\\Downloads");
		
	//----------------- When type="file" is not present--------------------------	
		
		WebElement a1=driver.findElement(By.id("uploadFile"));
		
		Actions act=new Actions(driver);
		act.moveToElement(a1).click().perform();
		
		Robot r1=new Robot();
		r1.delay(2000);
		
	//--------------------- Copy File to Upload ---------------------------------
		StringSelection ss=new StringSelection("C:\\Users\\HP\\Downloads");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //--------------------- Perform Control + V ---------------------------------
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
