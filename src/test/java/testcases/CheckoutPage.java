package testcases;

import org.testng.annotations.Test;

import pageobjects.CheckoutPom;
import testflipkart.Baseclass;
import utils.Log;

public class CheckoutPage extends Baseclass{
	@Test()
	public void func() {
	
		CheckoutPom obj=new CheckoutPom(driver,wait);
		
		chkoutname=obj.getname();
		System.out.println(chkoutname);

	
		chkoutprice = obj.getprice().substring(1);
		System.out.println(chkoutprice);
		Log.info("Checkout page, saving product for later");
		obj.saveforlater();
		
	
	}

}
