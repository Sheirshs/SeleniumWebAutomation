package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPom {
	WebDriver driver;
	WebDriverWait wait;
	public LoginPom(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	By Username = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	
	By Password = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	
	By login = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	By loginpopup=By.xpath("//button[@Class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	 
	
	public void setusername(String username)
	{
		driver.findElement(Username).sendKeys(username);
	}
	public void setpassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void clicklogin() 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(login))).click();
		
	}
	public void logintosite(String username, String password)
	{
		this.setusername(username);
		this.setpassword(password);
		this.clicklogin();
		checklogin();
	}
	
	public void checklogin()
	{
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(loginpopup));
	}

}
