package functionalComponent;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import siteFactory.SiteFactory;




		public class driver {
			private SiteFactory factory;
			
			public driver (SiteFactory factory){
				
				this.factory = factory;
			}  


	public void selectdriver(String browserName, String URL ){
		
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
			//return driver;
			
		
		
	}
	
	
}

