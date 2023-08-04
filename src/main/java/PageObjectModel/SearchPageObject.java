package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageObject {

	public WebDriver driver;
	private By SearchBox=By.xpath("//input[@name='search']");
	private By SearchBtn=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By ClickonSelectedIphione=By.xpath("//a[contains(text(),'iPhone')]");
	private By IphonePrice=By.xpath("//p[@class='price']");
	private By addtocart=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By searchbox=By.xpath("(//input[@name='search'])[1]");
	private By ClickSearchBtn=By.xpath("(//button[@type='button'])[4]");
	private By SamsungPrice=By.xpath("(//p[@class='price'])[2]");
	private By AddtoCart=By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By CartTotal=By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	private By sum=By.xpath("(//td[@class='text-right'])[12]");
	
	public SearchPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement SearchBox() {
		return driver.findElement(SearchBox);
		
	}
	public WebElement SearchBtn() {
		return driver.findElement(SearchBtn);
		
	}
	public WebElement ClickonSelectedIphione() {
		return driver.findElement(ClickonSelectedIphione);
		
	}

	public WebElement IphonePrice() {
		return driver.findElement(IphonePrice);
		
	}
	
	public WebElement addtocart() {
		return driver.findElement(addtocart);
		
	}
    
	public WebElement searchbox() {
		return driver.findElement(searchbox);
		
	}
	public WebElement ClickSearchBtn() {
		return driver.findElement(ClickSearchBtn);
		
	}
	public WebElement SamsungPrice() {
		return driver.findElement(SamsungPrice);
		
	}
	public WebElement AddtoCart() {
		return driver.findElement(AddtoCart);
		
	}
	public WebElement CartTotal() {
		return driver.findElement(CartTotal);
		
	}
	public WebElement sum() {
		return driver.findElement(sum);
		
	}

}
