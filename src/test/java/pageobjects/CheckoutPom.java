package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPom {
	WebDriver driver;
	WebDriverWait wait;
	public CheckoutPom(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	By name=By.xpath("(//a[@class='_2Kn22P gBNbID'])[1]");
	By price=By.xpath("(//span[@class='_2-ut7f _1WpvJ7'])[1]");
	By SaveForLater=By.xpath("//div[contains(text(),'Save for later')]");
	
	public String getname()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(name)).getText();
		
	}
	public String getprice()
	{
		return driver.findElement((price)).getText();
	}
	
	public void saveforlater()
	{
		driver.findElement(SaveForLater).click();
	}
	
}
