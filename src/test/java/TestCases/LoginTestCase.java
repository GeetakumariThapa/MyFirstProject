package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.constant;

public class LoginTestCase extends BaseClass  {
   @Test
	public void Login () throws IOException {
	  
    	LoginPageObject obj1 = new LoginPageObject(Driver);
    	
    	Driver.manage().window().maximize();
    	
    	obj1.NevigateAccount().click();
    	obj1.NevigateToLogin().click();
    	obj1.EmailId().sendKeys(constant.ID);
    	obj1.Password().sendKeys(constant.Pass);
    	obj1.Submit().click();
	}
}
