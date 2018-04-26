package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class QualificationPage extends CommonFunctions{
	
	SiteFactory factory;
	  
	
	   public QualificationPage (SiteFactory factory, WebDriver driver){
		   
		   this.factory= factory;
	   }

	
	//public By NextBtn= By.xpath("//*[@id='SubmissionWizard:Next-btnInnerEl']");
	public By NextBtn= By.xpath("//*[@id='SubmissionWizard:Next']");
		
	
	public void clickNextBtn() throws Exception
    {

    	clickButton(NextBtn);  
    	unconditionalWait(2);
    		       
    }

}
