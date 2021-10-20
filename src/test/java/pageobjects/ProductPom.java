package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPom {
	WebDriver driver;
	WebDriverWait wait;
	public ProductPom(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	By name=By.xpath("//span[@class='B_NuCI']");
	By price=By.xpath("//div[@class='_30jeq3 _16Jk6d']");
	By AddToCart=By.xpath("//button[text()='ADD TO CART']");
	public String getname()
	{
		return wait.until(ExpectedConditions.presenceOfElementLocated(name)).getText();
	}
	public String getprice()
	{
		return driver.findElement(price).getText();
	}
	public void AddToCart()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCart)).click();
	}
}
