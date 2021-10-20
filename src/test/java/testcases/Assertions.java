package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testflipkart.Baseclass;

public class Assertions extends Baseclass{
	@Test
	public void assertinfo()
	{

		Assert.assertEquals(searchprice, chkoutprice,"Price does not match"); // to check wether price is same on checkout screen and product
														// screen
		Boolean check = searchname.contains(chkoutname); // to check wether the name on checkout is similar to name on
															// product screen
		Assert.assertTrue(check, "Name does not match");
	}

}
