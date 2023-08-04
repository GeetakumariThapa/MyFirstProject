package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {

	public WebDriver driver;
	
	private By NavigatetoMyAccount=By.xpath("//i[@class='fa fa-user']");
	private By NevigatetoRegister=By.xpath("//a[contains(text(),'Register')]");
	private By FirstName=By.xpath("//input[@name='firstname']");
	private By LastName=By.xpath("//input[@name='lastname']");
	private By Email=By.xpath("//input[@name='email']");
	private By telephone=By.xpath("//input[@name='telephone']");
	private By password=By.xpath("//input[@name='password']");
	private By Confirmpassword=By.xpath("//input[@name='confirm']");
	private By RadioBtn=By.xpath("//input[@name='newsletter']");
	private By checkbox=By.xpath("//input[@type='checkbox']");
	private By submit=By.xpath("//input[@type='submit']");


	public RegisterPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement NavigatetoMyAccount() {
		return driver.findElement(NavigatetoMyAccount);
		
	}
	
	public WebElement NevigatetoRegister() {
		return driver.findElement(NevigatetoRegister);
		
	}
	public WebElement FirstName() {
		return driver.findElement(FirstName);
		
	}
	public WebElement LastName() {
		return driver.findElement(LastName);
		
	}
	public WebElement Email() {
		return driver.findElement(Email);
		
	}
	public WebElement telephone() {
		return driver.findElement(telephone);
		
	}
	public WebElement password() {
		return driver.findElement(password);
		
	}
	public WebElement Confirmpassword() {
		return driver.findElement(Confirmpassword);
		
		}
	public WebElement RadioBtn() {
		return driver.findElement(RadioBtn);
		
		}
	public WebElement checkbox() {
		return driver.findElement(checkbox);
		
		}
	public WebElement submit() {
		return driver.findElement(submit);
		}
	}

