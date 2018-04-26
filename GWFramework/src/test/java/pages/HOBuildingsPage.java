package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class HOBuildingsPage extends CommonFunctions{
		
		SiteFactory factory;		  
		
		   public HOBuildingsPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }

	
		 
		public By NextBtn= By.xpath("*[@id='SubmissionWizard:Next-btnInnerEl']");
	}
