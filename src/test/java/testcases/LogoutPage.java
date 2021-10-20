package testcases;


import org.testng.annotations.Test;
import pageobjects.LogoutPom;
import testflipkart.Baseclass;
import utils.Log;

public class LogoutPage extends Baseclass{

	@Test()
	public void logouttest()
	{
		
		LogoutPom obj=new LogoutPom(driver,wait);
		obj.logoutclick();
		Log.info("***************Logging out of Flipkart website*****************");
		
	}
}
