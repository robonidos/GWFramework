package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class DriversAction {
private SiteFactory factory;
      
      public DriversAction (SiteFactory factory){
            
            this.factory = factory;
      }
      
      public void AddNewDriverDetails(String FirstName, String LastName, String Dob, String AddrsLn1,String StateName,
    		  String AddrsType, String LicenseNo, String LicenseSt, String SSNValue, String LicenseYr, 
    		  String accdntsatPolLvl, String violationsatPolLvl, String accdntsatAccntLvl, String violationsatAccntLvl) throws Exception
      {
    	  
      factory.driversPage().clickAddNewDriverBtn();  
      factory.driversPage().clickAddNewPersonLbl();  
      factory.driversPage().enterFirstName(FirstName);  
      factory.driversPage().enterLastName(LastName);
      factory.driversPage().enterDateofBirth(Dob);
      factory.driversPage().enterAddress1(AddrsLn1);  
      factory.driversPage().enterState(StateName);  
      factory.driversPage().enterAddressType(AddrsType);  
      factory.driversPage().enterLicense(LicenseNo); 
      factory.driversPage().enterLicenseState(LicenseSt); 
      factory.driversPage().enterSSN(SSNValue);
      factory.driversPage().clickOkBtn();
      factory.driversPage().clickonRolesTab();
      factory.driversPage().enterYearFirstLicensedVal(LicenseYr);
      factory.driversPage().enterNoofAccidentsatPolictLvl(accdntsatPolLvl);
     // factory.driversPage().enterNoofAccidentsatAccntLvl(accdntsatAccntLvl);
      factory.driversPage().enterNoofViolationsatPolictLvl(violationsatPolLvl);
      
     // factory.driversPage().enterNoofViolationsatAccntLvl(violationsatAccntLvl);
      factory.driversPage().clickAddDrverChckBox();
      factory.driversPage().clickNextBtn();
      }

}


