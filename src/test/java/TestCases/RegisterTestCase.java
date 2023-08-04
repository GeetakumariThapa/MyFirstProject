package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;
import PageObjectModel.RegisterPageObject;
import Resources.BaseClass;

public class RegisterTestCase extends BaseClass {

	@Test
	public void verifyRegister() throws IOException {
		
		initializeDriver();
		Driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		RegisterPageObject obj=new RegisterPageObject(Driver);
		
		Driver.manage().window().maximize();
		
		obj.NavigatetoMyAccount().click();
		obj.NevigatetoRegister().click();
		obj.FirstName().sendKeys("Geetakmari");
		obj.LastName().sendKeys("Thapa");
		obj.Email().sendKeys("geetathapa1512@gmail.com");
		obj.telephone().sendKeys("9307541283");
		obj.password().sendKeys("geeta@2109");
		obj.Confirmpassword().sendKeys("geeta@2109");
		obj.RadioBtn().click();
		obj.checkbox().click();
		obj.submit().click();
	
	}

}
