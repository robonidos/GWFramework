package functionalComponent;
import org.openqa.selenium.WebDriver;
import gwtest.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonFunctions {
	
	public static WebDriver driver = null;
	public static boolean verifyStatus = false;
	public static String verifyErrorMessage = "";
	
	
    public static WebDriver selectdriver(String browserName, String URL ){
		
		//WebDriver driver= null;
		
		if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}else if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritaghosh\\Desktop\\ChromeDriver\\chromedriver.exe");
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

	
	

	public void clickButton(By locator)  throws Exception  {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);                      // timeout of 20 seconds
		WebElement dynamicElement =  wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dynamicElement.click();               //To click the button
	}
	
	

	public void cleartextbox(By locator)  throws Exception  {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);                      // timeout of 20 seconds
		WebElement dynamicElement =  wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dynamicElement.clear();               //To click the button
	}



	public void enterText(By locator, String dataText) throws Exception {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);                      // timeout of 20 seconds
		WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dynamicElement.clear();              //To clear the field
		dynamicElement.sendKeys(dataText);                   //To enter the text into the input field
	}

	
	public String returnText(By locator) throws Exception {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);                      // timeout of 20 seconds
		WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text = dynamicElement.getText();                //To get the text 
		return text;
	}
	
	public void selectFromDropdown (By locator, String option)
	{
		try{
			Select dropdown = new Select (driver.findElement(locator));
			 dropdown.selectByVisibleText(option);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	public static void unconditionalWait (int seconds)
	{
		try{
			Thread.sleep(seconds*1000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
			
	}	
			
			
			
			
			
			
			
			
		
		
  /*  public static void verifyMethod(String errorMsg, boolean status){
    	
    	verifyStatus = false;
    	if (!status){
    		verifyErrorMessage = verifyErrorMessage+"\n"+errorMsg;
    	 }
	  
	  
       }		
		*/
		
		
		

	
	
	
	

}
