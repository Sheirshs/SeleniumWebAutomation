package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelDataProvider.Dataprovider;
import pageobjects.LoginPom;
import testflipkart.Baseclass;
import utils.Log;

public class LoginPage extends Baseclass {
	
/*	@DataProvider
	Object[][] getdata() {
		Object[][] data = Dataprovider.getTestData();
		return data;
	}
*/	
//	@Test(dataProvider="getdata")
	public void logintest() 
	{
		
		Log.info("**************Logging in to flipkart website***************");
		
		
		LoginPom obj=new LoginPom(driver,wait);
		obj.logintosite(username,password);
		
		
		
	
	}
}
