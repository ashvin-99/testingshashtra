package ScreenShotCapturing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static  void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
   //--- Convert driver object into TakesScreenshot Interface
        TakesScreenshot ts=(TakesScreenshot)driver;
   //--- Using typecasted object we call getScreenshotAs method and here we need to pass an argument
   //--- which is OutputType.FILE
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
   //--- After calling above method , it will take screenshot but stores it  in local memory
   //--- In order to store this Screenshot in Specific folder we need to call copyFile which is 
   //--- present in File class and it contains two argument
        File descFile=new File("C:\\TrainingWorkplace\\TestingShashtra\\Screenshots\\fullPage.png");
        FileUtils.copyFile(sourceFile, descFile);
   //---------------------------------------------------------------------------------------
        //----- Capturing specific Area from WebPage
        
        
        
        
        
        
        

        driver.quit();
	}

}
