package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class OfferingsPage extends CommonFunctions{
		
		SiteFactory factory;
		  
		
		   public OfferingsPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }

	
	
	public By OfferingSelection= By.xpath("//*[@id='SubmissionWizard:OfferingScreen:OfferingSelection-inputEl']");
	public By NextBtn= By.xpath("//*[@id='SubmissionWizard:Next']");
	
	
	public void enterOfferingSelection(String OfrgSelection) throws Exception
	{
		enterText(OfferingSelection,OfrgSelection);   
	}
	
	public void clickNextBtn() throws Exception
    {

    	clickButton(NextBtn); 
    	unconditionalWait(2);
    		       
    }
}
