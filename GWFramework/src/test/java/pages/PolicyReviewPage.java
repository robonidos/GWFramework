package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class PolicyReviewPage extends CommonFunctions{
	
	SiteFactory factory;
	  
	
	   public PolicyReviewPage (SiteFactory factory, WebDriver driver){
		   
		   this.factory= factory;
	   }
	   
	   public By QuoteBtn = By.xpath("//span[contains(@id,'Quote')]");
	   public By ClearBtn = By.xpath("//span[contains(@id,'ClearButton')]");
	   public By NextBtn= By.xpath("//span[contains(text(), 'Next')]");
	   
	   public void clickonQuoteButton() throws Exception
       {

         clickButton(QuoteBtn);
         unconditionalWait(3);
         
      }
	   
	   public void clickonClearButton() throws Exception
       {

         clickButton(ClearBtn);
         unconditionalWait(3);
         
      }
	   
	   public void clickNextBtn() throws Exception
       {
   		unconditionalWait(2);

       	clickButton(NextBtn);   
       		       
       }
	   
	   
}