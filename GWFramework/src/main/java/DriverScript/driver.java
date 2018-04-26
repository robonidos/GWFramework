package DriverScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class driver{

	/*public static void main(String[] args) {
		
	String browser="firefox";
	String URL= "http://www.seleniumhq.org/";
	driver driverObj= new driver();
	driverObj.selectdriver(browser, URL);
	
	}*/

	public WebDriver selectdriver(String browserName, String URL ){
		
		WebDriver driver= null;
		
		if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}else if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\guarora\\Desktop\\Selenium Training\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		
			}else if (browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\guarora\\Desktop\\Selenium Training\\Drivers\\IEDriverServer.exe");
			DesiredCapabilities caps= DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			caps.setCapability("ignoreZoomSetting", true);
			driver= new InternetExplorerDriver(caps);
			}
		
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		
		
	}
	
	
}

