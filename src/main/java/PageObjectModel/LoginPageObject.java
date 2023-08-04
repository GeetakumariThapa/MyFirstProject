package PageObjectModel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	
		public WebDriver driver;
		
		private By NevigateAccount=By.xpath("(//i[@class='fa fa-user'])");
		private By NevigateToLogin=By.xpath("//a[contains(text(),'Login')]");
		private By EmailId=By.xpath("//input[@name='email']");
		private By Password=By.xpath("//input[@name='password']");
		private By Submit=By.xpath("//input[@type='submit']");
		
		
	
		public LoginPageObject(WebDriver driver2) {
			this.driver=driver2;
		}
		public WebElement NevigateAccount() {
			return driver.findElement(NevigateAccount);
			
		}
		public WebElement NevigateToLogin() {
			return driver.findElement(NevigateToLogin);
			
		}
		public WebElement EmailId() {
			return driver.findElement(EmailId);
			
		}
		public WebElement Password() {
			return driver.findElement(Password);
			
		}
		public WebElement Submit() {
			return driver.findElement(Submit);
			
		}
	

}
