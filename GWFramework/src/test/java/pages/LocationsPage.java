package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class LocationsPage extends CommonFunctions{
		
		SiteFactory factory;		  
		
		   public LocationsPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }

	
		 
	public By LocationCheckbox= By.xpath("//*[@id='ext-gen14345']/div/img");
	public By NextBtn= By.xpath("//*[@id='SubmissionWizard:Next-btnInnerEl']");
	
	
	
	public void clickLocationCheckbox() throws Exception
	{
		clickButton(LocationCheckbox);   
	}
	
	public void clickNextBtn() throws Exception
    {

    	clickButton(NextBtn); 
    	unconditionalWait(2);
    		       
    }
}
