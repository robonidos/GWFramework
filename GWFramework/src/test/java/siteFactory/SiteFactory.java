package siteFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import action.PCLoginAction;
import action.CreateAccountAction;
import action.NewAccountAction;
import action.NewSubmissionAction;
import action.NewSubmissionNavigationAction;
import action.OfferingsAction;
import action.PolicyInfoAction;
import action.QualificationAction;
import action.VehicleAction;
import action.PACoverageAction;
import action.RiskAnalysisAction;
import action.StateInfoAction;
import action.DriversAction;
import action.HOBuildingsAction;
import action.HOLocationsAction;
import action.PolicyReviewAction;
import action.PaymentAction;

import functionalComponent.CommonFunctions;

import functionalComponent.driver;
import pages.CreateAccountPage;
import pages.NewAccountPage;
import pages.NewSubmissionNavigationPage;
import pages.OfferingsPage;
import pages.NewSubmissionPage;
import pages.PACoveragesPage;
import pages.PCLoginPage;
import pages.PolicyInfoPage;
import pages.QualificationPage;
import pages.StateInfoPage;
import pages.VehiclePage;
import pages.RiskAnalysisPage;
import pages.DriversPage;
import pages.HOBuildingsPage;
import pages.LocationsPage;
import pages.PolicyReviewPage;
import pages.PaymentPage;







public class SiteFactory {
	
	public CommonFunctions commonfunction(){
		return new CommonFunctions();
				
	}
	
	/*   public driver driver (){
			
			return new driver(this);
		} */
	
	public WebDriver driverObject(){
		return CommonFunctions.driver;
			
	}
	
	public NewAccountPage newAccountPage (){
		
		return new NewAccountPage(this, driverObject());
	}
	
   public NewAccountAction newAccountAction (){
		
		return new NewAccountAction(this);
	}
   
	public CreateAccountPage createAccountPage (){
		
		return new CreateAccountPage(this, driverObject());
	}
	
   public CreateAccountAction createAccountAction (){
		
		return new CreateAccountAction(this);
	}
   
	public PCLoginPage pcLoginPage (){
		
		return new PCLoginPage(this, driverObject());
	}
	
   public PCLoginAction pcLoginAction (){
		
		return new PCLoginAction(this);
		
	}
   
  public NewSubmissionPage newSubmissionPage (){
		
		return new NewSubmissionPage(this, driverObject());
	}
	
   public NewSubmissionAction newSubmissionAction (){
		
		return new NewSubmissionAction(this);
		
	}
   
   public OfferingsPage offeringsPage (){
		
		return new OfferingsPage(this, driverObject());
	}
	
  public OfferingsAction offeringsAction (){
		
		return new OfferingsAction(this);
		
	}
  
  
  public QualificationPage qualificationPage (){
		
		return new QualificationPage(this, driverObject());
	}
	
 public QualificationAction qualificationAction (){
		
		return new QualificationAction(this);
		
	}
 
   public PolicyInfoPage policyInfoPage (){
		
		return new PolicyInfoPage(this, driverObject());
	}
	
  public PolicyInfoAction policyInfoAction (){
		
		return new PolicyInfoAction(this);
		
	}

  public DriversPage driversPage() {
      
      return new DriversPage(this, driverObject());
  }

  public DriversAction driversAction() {
      return new DriversAction (this);
  }
  
  public VehiclePage vehiclePage() {
      
      return new VehiclePage(this, driverObject());
  }

  public VehicleAction vehicleAction() {
      return new VehicleAction (this);
  }
  
  
  public PACoveragesPage pacoveragesPage()
  {
        return new PACoveragesPage(this, driverObject());
  }
  
  public PACoverageAction pacoverageAction()
  {
        return new PACoverageAction (this);
  }


  public RiskAnalysisPage riskAnalysisPage() {
      return new RiskAnalysisPage(this, driverObject());
  }

  public RiskAnalysisAction riskAnalysisAction() {
      
      return new RiskAnalysisAction(this);

  }
	
  public PolicyReviewPage policyReviewPage() {
      return new PolicyReviewPage(this, driverObject());
  }

  public PaymentPage paymentPage() {
      return new PaymentPage(this, driverObject());
  }

  //Homeowner addtion **Rohit**
  
  public LocationsPage locationsPage() {
      return new LocationsPage(this, driverObject());
  }

  public HOBuildingsPage hoBuildingsPage() {
      return new HOBuildingsPage(this, driverObject());
  }
  
public HOLocationsAction hoLocationsAction() {
      
      return new HOLocationsAction(this);

  }
//Yet to finish
public HOBuildingsAction hoBuildingsAction() {
    
    return new HOBuildingsAction(this);

}
  
  public PolicyReviewAction policyReviewAction() {
  
	  return new PolicyReviewAction(this);

  }
	
public PaymentAction paymentAction() {
      
      return new PaymentAction(this);

  }

//Commercial Auto -Rohit
public StateInfoPage stateInfoPage() {
    return new StateInfoPage(this, driverObject());
}

public StateInfoAction stateInfoAction() {
    
    return new StateInfoAction(this);

}


}
