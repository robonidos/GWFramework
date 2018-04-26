package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class RiskAnalysisAction {
private SiteFactory factory;
      
      public RiskAnalysisAction (SiteFactory factory){
            
            this.factory = factory;
      }


    public void defineRiskAnalysisValues(String ViewIssVal, String LsHstryTyp )throws Exception
     {
      factory.riskAnalysisPage().SelViewIssuesBlckVal(ViewIssVal);
      factory.riskAnalysisPage().clickOnPriorLosses();
      factory.riskAnalysisPage().SelLossHistoryType(LsHstryTyp);
      factory.riskAnalysisPage().clickNextButton() ;
          
   }
   }
