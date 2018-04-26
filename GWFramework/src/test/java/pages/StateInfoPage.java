package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class StateInfoPage extends CommonFunctions{
		
		SiteFactory factory;		  
		
		   public StateInfoPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }

	
		 
	public By BodilyInjury= By.xpath("*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BAStateInfoScreen:BAStateCoveragesPanelSet:BAPVehicleStateGrpIterator:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl']");
	public By PropertyDamage= By.xpath("*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BAStateInfoScreen:BAStateCoveragesPanelSet:BAPVehicleStateGrpIterator:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']");
	public By NextBtn= By.xpath("*[@id='SubmissionWizard:Next-btnInnerEl']");
	
	
	public void enterBodilyInjury(String BdlyInjry) throws Exception
	{
		enterText(BodilyInjury,BdlyInjry);        
	}
	
	public void enterPropertyDamage(String PrprtyDmg) throws Exception
	{
		enterText(PropertyDamage,PrprtyDmg);        
	}
	
	
	public void clickNextBtn() throws Exception
    {

    	clickButton(NextBtn); 
    	unconditionalWait(2);
    		       
    }
}
