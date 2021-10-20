package testcases;


import org.testng.annotations.Test;

import pageobjects.ProductPom;
import testflipkart.Baseclass;
import utils.Log;

public class ProductPage extends Baseclass {
	
	@Test()
	public void AddProductToCart()
	{
		ProductPom obj3=new ProductPom(driver,wait);
	    searchname=obj3.getname();
		System.out.println(searchname);

		
		searchprice = obj3.getprice().substring(1);
		System.out.println(searchprice);
		
		obj3.AddToCart();
		Log.info("Added product to cart");

	}
	

}
