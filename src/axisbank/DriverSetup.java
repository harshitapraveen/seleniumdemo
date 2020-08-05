package axisbank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSetup {
		
    public static WebDriver driver;         
	public static String WebsiteUrl = "https://www.axisbank.com/retail/calculators/fd-calculator";               
	public  WebDriver setUpChrome()
	{
	System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	ChromeOptions Options = new ChromeOptions();
	Options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(Options);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.navigate().to(WebsiteUrl);
	return driver;
	}

	public static WebDriver setUpFirefox(){
	System.setProperty("webdriver.gecko.driver", "");
	FirefoxOptions Options = new FirefoxOptions();
	Options.addArguments("--disable-notifications");
	driver = new FirefoxDriver(Options);
	WebDriver driver = new FirefoxDriver(Options);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.navigate().to(WebsiteUrl);
	return driver;
	}

	public static WebDriver setUpIE(){
	System.setProperty("webdriver.ie.driver", "");
	DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	cap.setCapability("nativeEvents", false);
	cap.setCapability("unexpectedAlertBehaviour", "accept");
	cap.setCapability("ignoreProtectedModeSettings", true);
	cap.setCapability("disable-popup-blocking", true);
	cap.setCapability("enablePersistentHover", true);
	cap.setCapability("ignoreZoomSetting", true);
	cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	InternetExplorerOptions options = new InternetExplorerOptions();
	options.merge(cap);
	WebDriver driver = new InternetExplorerDriver(options);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.navigate().to(WebsiteUrl);
	return driver;
	}

	}

	 


