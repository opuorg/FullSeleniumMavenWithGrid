package driverPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverClass {
	protected static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"Browser"})
	public static void driverMethod(String Browser) throws MalformedURLException{
		if(Browser.equalsIgnoreCase("firefox")){
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("firefox");
		driver= new RemoteWebDriver (new URL("http://192.168.0.116:4444/wd/hub"), capability);
		}else if (Browser.equalsIgnoreCase("chrome")){
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setBrowserName("chrome");
			driver= new RemoteWebDriver (new URL("http://192.168.0.116:4444/wd/hub"), capability);
		}else if(Browser.contains("Safari")){
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setBrowserName("safari");
			driver= new RemoteWebDriver (new URL("http://192.168.0.116:4444/wd/hub"), capability);
		}else if(Browser.equalsIgnoreCase("internet explorer")){
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setBrowserName("internet explorer");
			driver= new RemoteWebDriver (new URL("http://192.168.0.116:4444/wd/hub"), capability);
		}else{
			System.out.println("Please specify a valid Browser");
		}
//		if(Browser.equalsIgnoreCase("firefox")){
//		System.setProperty("webdriver.firefox.marionette", "geckodriver");
//		driver = new FirefoxDriver();
//		System.out.println(Browser);
//		}else if(Browser.equalsIgnoreCase("chrome")){
//			System.setProperty("webdriver.chrome.driver", "chromedriver2");
//			driver=new ChromeDriver();	
//			System.out.println(Browser);
//		}else if(Browser.equalsIgnoreCase("safari")){
//			driver = new SafariDriver();
//			System.out.println(Browser);
//		}else{
//			System.out.println("Please enter a valid browser in the suite parameter.");
//		}
	}

}
