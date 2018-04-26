package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;
import functionalComponent.CommonFunctions;

public class DriversPage extends CommonFunctions {

      SiteFactory factory;
     
      
      public DriversPage (SiteFactory factory, WebDriver driver){
               
               this.factory= factory;
               
         }
      
        public By AddDriverButton = By.xpath("//span[contains(@id,'AddDriver-btn')]");
        public By NewPersonLabel = By.xpath("//span[contains(text(),'New Person')]");
        public By FirstName = By.xpath("//input[contains(@id,'FirstName-input')]");
        public By LastName = By.xpath("//input[contains(@id,'LastName-input')]");
        public By DateofBirth = By.xpath("//input[contains(@id,'DateOfBirth')]");
        public By AddrsLn1 = By.xpath("//input[contains(@id,'AddressLine1-input')]");
        public By StateName = By.xpath("//input[contains(@id,'State-input')]");
        public By AddrssType = By.xpath("//input[contains(@id,'AddressType-input')]");
        public By License = By.xpath("//input[contains(@id,'LicenseNumber')]");
        public By LicenseStateName = By.xpath("//input[contains(@id,'LicenseState-input')]");
        public By SSN= By.xpath("//*[contains(@id,'OfficialIDDV_Input-input')]//*[contains(@type,'text')]");
        public By OkBtn = By.xpath("//span[contains(text(),'OK')]");
        public By DriverRolesTab = By.xpath("//span[contains(@id,'DriverDetailsCV:RolesCard')]");
        public By LicenseYear = By.xpath("//input[contains(@id,'yearlicensed')]");
       
        public By AccidentsatPolicyLvl = By.xpath("//div[contains(@id,'PolicyContactRolePanelSet:2-body')]//table//tr[1]//td[2]");
        public By ViolationsatPolicyLvl = By.xpath("//div[contains(@id,'PolicyContactRolePanelSet:2-body')]//table//tr[2]//td[2]");
      
        public By AccidentsatAccntLvl = By.xpath("//div[contains(@id,'PolicyContactRolePanelSet:2-body')]//table//tr[1]//td[3]");
        public By ViolationsatAccntLvl = By.xpath("//div[contains(@id,'PolicyContactRolePanelSet:2-body')]//table//tr[2]//td[3]");
       
        public By AddDrvrChckBox = By.xpath("//div[contains(@class,'checkcolumn')]");
        public By BackButton = By.xpath("//span[contains(text(), 'Back')]");
        public By NextButton = By.xpath("//span[contains(text(), 'Next')]");
        
        private String CommonXpath = "//li[contains(text(),'{0}')]";
      
//Methods
        
      public void clickAddNewDriverBtn() throws Exception{
    	  
    	  unconditionalWait(2);
    	  clickButton(AddDriverButton);
      }  
      
     public void clickAddNewPersonLbl() throws Exception{
    	  
    	  clickButton(NewPersonLabel);
      } 
     
     public void enterFirstName(String FrstName) throws Exception{
    	 
    	 enterText(FirstName, FrstName );
     }
     
    public void enterLastName(String LstName) throws Exception{
    	 
    	 enterText(LastName, LstName );
     }
    
    public void enterDateofBirth(String Dob) throws Exception{
   	 
   	 enterText(DateofBirth, Dob );
    }
    
    public void enterAddress1(String Adrs1) throws Exception
    {
    	enterText(AddrsLn1,Adrs1);    	
    }
      
      
      public void enterState(String StNm) throws Exception
      {
   	       clickButton(StateName);  
   	       unconditionalWait(3);
   	       String StateNm = CommonXpath.replace("{0}", StNm);   	 
      	   clickButton(By.xpath(StateNm));
      	   unconditionalWait(2);

      }
      
      public void enterAddressType(String addrType) throws Exception
      {
      	
      	clickButton(AddrssType);
      	String AddrTypeVal = CommonXpath.replace("{0}", addrType);   	 
      	clickButton(By.xpath(AddrTypeVal));
    	
      }
      
      public void enterLicense(String LicenseNo) throws Exception{
     	 
     	 enterText(License, LicenseNo );
      }
      
      public void enterLicenseState(String LincenseStNm) throws Exception
      {
   	       clickButton(LicenseStateName);  
   	       unconditionalWait(3);
   	       String LcsnseStateNm = CommonXpath.replace("{0}", LincenseStNm);   	 
      	   clickButton(By.xpath(LcsnseStateNm));
      	   unconditionalWait(2);

      }
      
      public void enterSSN(String SSNValue) throws Exception
      {
      	enterText(SSN,SSNValue);    	
      }
      
      public void clickOkBtn() throws Exception
      {
            clickButton(OkBtn); 
      }
      
      public void clickonRolesTab() throws Exception
      {
            clickButton(DriverRolesTab); 
      }
      
      public void enterYearFirstLicensedVal(String LicenseYr) throws Exception
      {
      	enterText(LicenseYear,LicenseYr);    	
      }
      
      public void enterNoofAccidentsatPolictLvl(String accdntsatPolLvl) throws Exception
      {
      	
      	clickButton(AccidentsatPolicyLvl);
      	String NoofAccdntsatPolLvl = CommonXpath.replace("{0}", accdntsatPolLvl);   	 
      	clickButton(By.xpath(NoofAccdntsatPolLvl));
      	unconditionalWait(2);
    	
      }
      
      public void enterNoofViolationsatPolictLvl(String violationsatPolLvl) throws Exception
      {
      	
      	clickButton(ViolationsatPolicyLvl);
      	String NoofViolationsatPolLvl = CommonXpath.replace("{0}", violationsatPolLvl);   	 
      	clickButton(By.xpath(NoofViolationsatPolLvl));
      	unconditionalWait(2);
    	
      }
      
      public void enterNoofAccidentsatAccntLvl(String accdntsatAccntLvl) throws Exception
      {
      	
      	clickButton(AccidentsatAccntLvl);
      	String NoofAccdntsatAccntLvl = CommonXpath.replace("{0}", accdntsatAccntLvl); 
      	unconditionalWait(1);
      	clickButton(By.xpath(NoofAccdntsatAccntLvl));
      	unconditionalWait(2);
    	
      }
      
      public void enterNoofViolationsatAccntLvl(String violationsatAccntLvl) throws Exception
      {
      	
      	clickButton(ViolationsatAccntLvl);
      	String NoofViolationsatAccntLvl = CommonXpath.replace("{0}", violationsatAccntLvl);   
      	unconditionalWait(1);
      	clickButton(By.xpath(NoofViolationsatAccntLvl));
      	unconditionalWait(2);
    	
      }
      
      
      public void clickAddDrverChckBox() throws Exception
      {
            clickButton(AddDrvrChckBox); 
      }
      
        
      public void clickBackBtn() throws Exception
      {
            clickButton(BackButton); 
      }
      public void clickNextBtn() throws Exception
      {
            clickButton(NextButton); 
      }

}
