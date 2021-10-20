package pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPom {

	WebDriver driver;
	WebDriverWait wait;
	public SearchPom(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	
	By searchbar=By.xpath("//input[@class='_3704LK']");
	By searchelem=By.xpath("//div[@data-id='CAME7JYVSNMHNYHQ']/div[@class='_2kHMtA']");
	By listelem=By.xpath("(//div[@class='_2kHMtA'])");

	public void search(String searchparam)
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchbar))).sendKeys(searchparam + Keys.ENTER);
	}
	public void scrollforelem()
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;//scroll until particular element is located
		WebElement elem = wait.until(ExpectedConditions
				.presenceOfElementLocated(searchelem));
		j.executeScript("arguments[0].scrollIntoView()", elem);
	}
	public void clickonSearchElem(int i)
	{
		//scrollforelem();
		By elem=By.xpath("(//div[@class='_2kHMtA'])["+i+"]/a");
		driver.findElement(elem).click();
	}
	public int getnoOfelem()
	{
		ArrayList<WebElement> ls=(ArrayList<WebElement>) driver.findElements(listelem);
		return ls.size();		
	}
	
}
