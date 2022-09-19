package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Verify_002 {

	  WebDriver driver;
	
	@FindBy(xpath ="//h1[@class='DUwDvf fontHeadlineLarge']")
			WebElement verifytext;
	
	@FindBy(xpath ="//span[@jstcache='803']")
	      WebElement ratings;
	
	@FindBy(xpath="//button[@aria-label='33,010 reviews']")
	       WebElement reviews;
	
	@FindBy(xpath = "//div[text()='mumbaicricket.com']")
	     WebElement link;
	
	@FindBy(xpath="//div[text()='WRQG+G8R, Vinoo Mankad Rd, Churchgate, Mumbai, Maharashtra 400020']")
	    WebElement adress;
	
	@FindBy(xpath="//div[text()='022 2279 5500']")
	   WebElement phonenumber ;
	
	public TC_Verify_002 (WebDriver driver) {
	
	PageFactory.initElements(driver,this );	
		}
	
	public void VerifyText() {
	       verifytext.isDisplayed();
	}

	public void Ratings() {
	        ratings.getText();
	}

	public void Reviews() {
	      reviews.getText();
	}

	public void Link() {
	     link.isDisplayed();
	}

	public void Adress() {
	        adress.getText();
	}
	
	public void PhoneNumber() {
	      phonenumber.isDisplayed();
	}
}
