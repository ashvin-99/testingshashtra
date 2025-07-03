package ConditionalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
	//	WebElement logo=driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
	//	System.out.println("Status of Logo : "+logo.isDisplayed());

		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display Status:"+searchbox.isDisplayed());
		System.out.println("Enable Status:"+searchbox.isEnabled());
	}

}
