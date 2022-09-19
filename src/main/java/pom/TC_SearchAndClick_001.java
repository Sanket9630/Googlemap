package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_SearchAndClick_001 {
 
	   WebDriver driver;
	@FindBy(xpath = "//input[@aria-label='Search Google Maps']")
	        WebElement Search ;
	
	@FindBy(xpath = "//button[@aria-label='Directions']")
	       WebElement directions ;
	
	public TC_SearchAndClick_001(WebDriver driver) {
	
		PageFactory.initElements(driver,this );	
	}
	

	public void Serach(String search) {
	 
		Search.sendKeys("Wankhede Stadium");
}

	public void Directions() {
	    directions.click();
	}

	
	}
