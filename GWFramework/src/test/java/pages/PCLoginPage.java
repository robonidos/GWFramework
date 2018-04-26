package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import gwtest.*;
import siteFactory.SiteFactory;
import functionalComponent.CommonFunctions;


	
	public class PCLoginPage extends CommonFunctions{
		
		SiteFactory factory;
		  
		
		   public PCLoginPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }

	//Locators
	
	public static By Username= By.xpath("//*[@id='Login:LoginScreen:LoginDV:username-inputEl']");
	public static By Password= By.xpath("//*[@id='Login:LoginScreen:LoginDV:password-inputEl']");
	public static By LoginChkBx= By.xpath("//*[@id='Login:LoginScreen:LoginDV:remember-inputEl']");
	public static By LoginBtn= By.xpath("//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']");

	//Methods
	
	public void enterUsername(String Usrnm) throws Exception
	{
		enterText(Username,Usrnm);        
	}

	public void enterPassword(String Pwd) throws Exception
	{
		enterText(Password,Pwd);        
	}
	
	public void chkLoginChkBx() throws Exception
	{
		clickButton(LoginChkBx);     
	}
	
	public void clickLoginBtn() throws Exception
	{
		clickButton(LoginBtn);     
	}


}
