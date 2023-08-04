package TestCases;

import org.testng.annotations.Test;
import PageObjectModel.SearchPageObject;
import Resources.BaseClass;
import Resources.constant;

public class SearchTestCase extends BaseClass{
    @Test
	public void Search() throws InterruptedException {
		
		SearchPageObject obj2 = new SearchPageObject(Driver);
		
		Driver.manage().window().maximize();
		
		//search the product iphone
		obj2.SearchBox().sendKeys(constant.product);
		obj2.SearchBtn().click();
		
		//add to cart
		//obj2.ClickonSelectedIphione().click();
		
		
		//fetching Iphone text
		//System.out.println(obj2.IphonePrice().getText());
		String IphonePrice = obj2.IphonePrice().getText(); //grab iphone price
		System.out.println(IphonePrice);
		String[] split = IphonePrice.split("\\s+"); //here we have to split in array and reolace with space
		System.out.println(split);
		String IphonePriceWtihDollor = split[0]; // to fetch 1st value from array
		System.out.println(IphonePriceWtihDollor);
		String RemoveDollor=split[0].replaceAll("[$]", ""); //remove dollor from price
		double a = Double.parseDouble(RemoveDollor); // convert iphone price in double
		System.out.println(a);
		
		obj2.addtocart().click();
		
		obj2.searchbox().clear(); //to clear the text
	
		obj2.searchbox().sendKeys(constant.product2); //to search for samsung
		
		obj2.ClickSearchBtn().click();
		
		String Samsungprice = obj2.SamsungPrice().getText();  //grab samsungtab price
		System.out.println(Samsungprice);
		String[] spl = Samsungprice.split("\\s+"); //here we have to split in array and reolace with space
		System.out.println(spl);
		String SamsungPriceWithDollor = spl[0];  //to fetch 1st value from array
		System.out.println(SamsungPriceWithDollor);
		String RemoveDollor1 = spl[0].replaceAll("[$]", ""); //remove dollor from price
		double b = Double.parseDouble(RemoveDollor1);
		System.out.println(b);
		
		double  Count = a + b ;
		System.out.println(Count);
		
		String DollorAdd = ("$"+Count);
		System.out.println(DollorAdd);
		
		
	    obj2.AddtoCart().click(); //samsung tab add to cart
		
		Thread.sleep(10000);
		obj2.CartTotal().click();
		
		String totalcart = obj2.sum().getText();
		System.out.println(totalcart);
		
		String RemoveDollor2 = totalcart.replaceAll("[$]", "");  // remove dollor from total cart price
		System.out.println(RemoveDollor2);
		
		double c = Double.parseDouble(RemoveDollor2);
		System.out.println(c);
		
		
		if (DollorAdd.equalsIgnoreCase(totalcart)) {
			System.out.println("test case is successfull");
		} else {
            System.out.println("test case is fail");
		}
}
    }
