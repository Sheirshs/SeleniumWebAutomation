package testflipkart;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Log;

public class Baseclass {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Properties prop;
	protected static String searchname;
	protected static String chkoutname;
	protected static String searchprice;
	protected static String chkoutprice;
	protected static String searchparam;
	protected static String browser;
	protected static int prodindex;
	protected static String username;
	protected static String password;

	@BeforeTest
	public void setup() throws Exception {
		String path = System.getProperty("user.dir");
		String CHROME_PATH = path + "\\drivers\\chromedriver.exe";
		String FIREFOX_PATH = path + "\\drivers\\geckodriver.exe";

		Properties prop = new Properties();
		FileInputStream propfile = new FileInputStream(path+"\\src\\test\\resources\\config.properties");
		prop.load(propfile);
		
		browser=prop.getProperty("browser");
		searchparam=prop.getProperty("searchParameter");
		username = prop.getProperty("username");
		password=prop.getProperty("password");
		
		// Check if parameter passed is for 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
			try {
				driver = new FirefoxDriver();
			} catch (Exception e) {
		
				throw new Exception("Driver initialisation failed");
			}
		}
		// Check if parameter passed is for 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", CHROME_PATH);
			// create chrome instance
			try {
				driver = new ChromeDriver();
			} catch (Exception e) {
				throw new Exception("Driver initialisation failed");
			}
		} else {
			throw new Exception("Please use correct browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("explicitWait")));
		driver.get(prop.getProperty("url"));
	}

	

	public void switchcurrent()
	{
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> i = wh.iterator();
		String last = "";
		while (i.hasNext()) {
			last = i.next();
		}
		driver.switchTo().window(last);
		//System.out.println(driver.getCurrentUrl());
	}
	public void randomproductselect(int min,int max)
	{
		 prodindex= (int) ((Math.random() * (max - min)) + min);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
