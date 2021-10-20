package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPom {

	WebDriver driver;
	WebDriverWait wait;
	public LogoutPom(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	By hovermenu=By.xpath("//div[@class='exehdJ']");
	By logout=By.xpath("(//li[@class='_2NOVgj'])[10]");
	
	public void hoverovermenu()
	{
		Actions actions = new Actions(driver);
		WebElement target = wait
				.until(ExpectedConditions.visibilityOfElementLocated(hovermenu));
		actions.moveToElement(target).perform(); // hovering over the element to display dropdown
	}
	public void logoutclick()
	{
		hoverovermenu();
		wait.until(ExpectedConditions.elementToBeClickable((logout))).click();
		
	}
	
}
