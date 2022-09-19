package testclasses;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import pom.TC_SearchAndClick_001;
import pom.TC_Verify_002;

public class SearchAndClick_001 extends BaseClass {

	TC_Verify_002  vr;
	TC_SearchAndClick_001 sc;
	
	@Test(priority=1)
	public void SearchAndClick()  {
		
		 sc = new TC_SearchAndClick_001(driver);
	       sc.Serach(baseUrl);
	       sc.Directions();
	       
	       }
	  
       @Test(priority=2)
	   	public void Verify() throws IOException {
	   	
	   		 vr = new TC_Verify_002(driver);
	   		 
	   		vr.VerifyText();
	   		vr.Ratings();
	   		vr.Reviews();
	   		vr.Link();
	   		vr.Adress();
	   		vr.PhoneNumber();
	   		if(driver.getTitle().equals("Wankhede Stadium - Google Maps")) {
		    	   Assert.assertTrue(true);
		    	   }
		          else {
			captureScreen(driver,"Verify");
		      Assert.assertTrue(false);
		      }
	       
	       
}
}
