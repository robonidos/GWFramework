package gwtest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import functionalComponent.driver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import functionalComponent.CommonFunctions;
import action.PCLoginAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import siteFactory.SiteFactory;
import action.*;
import pages.*;





public class NewTest{
	

	
	
  @Test
  public void login() throws Exception{
	  
	  SiteFactory factory = new SiteFactory();
	  
	  CommonFunctions.selectdriver("Chrome","http://localhost:8180/pc/PolicyCenter.do");
	  factory.pcLoginAction().login("su", "gw");
	  
	  factory.newAccountAction().searchAccntInfo("John", "Rohit", "Up", "United States", "NY", "Denver", "Alaska","99502");
	  factory.createAccountAction().updateAccountInfo("BILL","Smith","306 HAWTHORNE ST","Alaska","35004","Home","Allrisk Insurance"); 
	  factory.newSubmissionAction().createSingleSubmission("Personal Auto");
	  factory.offeringsAction().selectOffering("Basic Program");
	  factory.qualificationAction().qualificationSelect();
	  factory.policyInfoAction().updatePolicyInfo("Annual","01/01/2019","12/01/2018","876-87-9879");
	  factory.driversAction().AddNewDriverDetails("BIL","Smit","01/01/1990","305 HAWTHORNE ST","Alaska","Home","7654321","Alaska","876-87-9878","2017","0","0","0","0");
	  factory.vehicleAction().addVehicle("Passenger/Light Truck", "1HGBH41JXMN109186", "Alaska", "20000");
	  factory.pacoverageAction().enterPACoverageValues("50/100/25", "25,000");
	  factory.riskAnalysisAction().defineRiskAnalysisValues("Me", "No Loss History");
	  factory.policyReviewAction().quotePersonalAutoPolicy();
	  factory.paymentAction().issuePolicy("Direct Bill","Full Pay");
	  
	  
  }
  


	  

 
 
 
 

	  
	  //factory.pcLoginAction().login("su", "gw");*/
	  

	}



  




