package ConditionalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
		
	    WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	    
	    //====== Before selecting
	    
	    System.out.println(male_rd.isSelected());
	    System.out.println(female_rd.isSelected());
	    
	    //======= After Selecting
	    
	    male_rd.click();
	    System.out.println(""+male_rd.isSelected());

	   
	}

}
