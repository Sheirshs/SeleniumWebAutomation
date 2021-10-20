package testcases;

import org.testng.annotations.Test;
import pageobjects.SearchPom;
import testflipkart.Baseclass;
import utils.Log;

public class SearchPage extends Baseclass {
	
	@Test()
	public void search()
	{
		Log.info("Logged in successfully");
		
		SearchPom obj2=new SearchPom(driver,wait);
		obj2.search(searchparam);
		randomproductselect(2, obj2.getnoOfelem()-1);
		obj2.clickonSearchElem(prodindex);
	
		Log.info("CLicked on random product");
		switchcurrent();
	}

}
