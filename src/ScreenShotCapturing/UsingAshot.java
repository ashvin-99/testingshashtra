package ScreenShotCapturing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class UsingAshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        AShot a1=new AShot();
        //Screenshot s1=a1.takeScreenshot(driver);
		//ImageIO.write(s1.getImage(), "PNG", new File("C:\\TrainingWorkplace\\TestingShashtra\\Screenshots\\AshotFirst.png"));
//---------- Taking Full Page Screenshot---------------------------------------
        
        Screenshot s1=a1.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s1.getImage(), "PNG", new File("C:\\TrainingWorkplace\\TestingShashtra\\Screenshots\\AshotFirst.png"));

        driver.quit();
	}

}
