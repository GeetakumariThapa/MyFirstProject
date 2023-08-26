package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass{
	
	
	/* created method for WebDriver Driver = new ChromeDriver ();
	 * Driver. get (url)				(method is initializeDriver())
	 * import FileInputStream + Add throws Decleration for FileNotFoundException */
	
	/* first of all you should check optional object are on which page
	 * if it is in same then you should code in same class of page
	 * this Driver is from BaseClass 
	 * constructor is already created thats why we have to put parameter here
	 * we get the LoginPageObject because BaseClass extended */
	
		public Properties Prop;
		public WebDriver Driver;
	public void initializeDriver() throws IOException {
		
		FileInputStream fs = new FileInputStream("/home/pitambar/Geeta/01-04 java automation/eclipse/MyFirstProject/src/main/java/Resources/Data.properties");
		
		Prop = new Properties();
		Prop.load(fs);
		

		String browsername = Prop.getProperty("Browser");
		
		if (browsername.equalsIgnoreCase("Chrome")) {
			 Driver=new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("Firefox")) {
			 Driver=new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("Edge")) {
			 Driver=new EdgeDriver();
		}else {
			System.out.println("please choose proper driver");
		}
	}
	@BeforeMethod
	public void LaunchBrowserandUrl() throws IOException {
	//  driver.get("https://login.salesforce.com/"); this is also visible so we have to put this url in data properties file andd then we have to acces in base class
     //   driver.get(prop.getProperty("URL"));
        
       initializeDriver();
   	  Driver.get("https://naveenautomationlabs.com/opencart/"); //this is also visible so we have to put this url in data properties file andd then we have to acces in base class
      // driver.get(prop.getProperty("URL"));
		
	
	}
	
	
}