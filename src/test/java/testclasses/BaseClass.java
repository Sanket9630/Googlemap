package testclasses;

import java.io.File;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String baseUrl = readconfig.getApplicationURL();
	 public static WebDriver driver;
	 
	 @BeforeClass
	 public void Setup() {
	
		 System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		     driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		 driver.get(baseUrl);
	 }

	 @AfterClass
	 public void teardown() {
        driver.quit();;
	 }

	 public void captureScreen(WebDriver driver,String tname) throws IOException {
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File target = new File(System.getProperty("user.dir")+ "/Screenshots/"+tname+".png");
			
			FileHandler.copy(source, target);
		    System.out.println("Screenshot taken");
			
				
		}
		
	 
}
