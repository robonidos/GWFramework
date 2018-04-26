package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class PACoverageAction {
      
private SiteFactory factory;
      
      public PACoverageAction (SiteFactory factory){
            
            this.factory = factory;
      }
      

  	public void enterPACoverageValues(String Liability, String MedPaymentVal) throws Exception
  	{
  		factory.pacoveragesPage().SelAutoLiabilityPkg(Liability);
  		factory.pacoveragesPage().SelMedPaymnt(MedPaymentVal);
  		factory.pacoveragesPage().clickNextBtn();
  	
  	}
      
      

      public void PACvrgNavigateBack() throws Exception
      {
          factory.pacoveragesPage().clickBackBtn();
            
      }
      public void PACvrgNavigateNext() throws Exception
      {
          factory.pacoveragesPage().clickNextBtn();
            
      }
      
   
      
      

}
