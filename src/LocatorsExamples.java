
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	     
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//================= id locator===============
		
		driver.findElement(By.id("search_query_top")).sendKeys("Tshirts");
		
		//================= button -------------------------------
		
		driver.findElement(By.name("submit_search")).click();
		
		//================ linkText ------------------------------
		
		//driver.findElement(By.linkText("Blouse")).click();
		
		//================partialLinkText -------------------------
		
		//driver.findElement(By.partialLinkText("Blo")).click();
	}

}
