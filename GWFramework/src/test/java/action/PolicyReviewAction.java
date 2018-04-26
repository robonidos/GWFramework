package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class PolicyReviewAction {
private SiteFactory factory;
      
      public PolicyReviewAction (SiteFactory factory){
            
            this.factory = factory;
      }

      
      public void quotePersonalAutoPolicy()throws Exception
      {
       factory.policyReviewPage().clickonQuoteButton();
       factory.policyReviewPage().clickonClearButton();
       factory.policyReviewPage().clickonQuoteButton();
       factory.policyReviewPage().clickNextBtn();
       factory.policyReviewPage().clickNextBtn();
      
           
    }
      
      
}