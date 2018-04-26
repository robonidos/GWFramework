package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class PCLoginAction {
	private SiteFactory factory;
	
	public PCLoginAction (SiteFactory factory){
		
		this.factory = factory;
	}




	public void login(String username, String password) throws Exception{
		
		factory.pcLoginPage().enterUsername(username);
		factory.pcLoginPage().enterPassword(password);
		factory.pcLoginPage().chkLoginChkBx();
		factory.pcLoginPage().clickLoginBtn();
		
	}
}
