package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class NewAccountPage extends CommonFunctions{
	
	SiteFactory factory;
	  
	
	   public NewAccountPage (SiteFactory factory, WebDriver driver){
		   
		   this.factory= factory;
	   }
	   public By AccountDropDown= By.xpath("//a[contains(@id,'TabBar:AccountTab')]");
	    public By ActionsTab= By.xpath("//span[contains(@id,'Actions')]");
	  //  public By NewAccountLabel= By.xpath("//span[contains(@id,'AccountTab_NewAccount')]");
	    public By NewAccountLabel= By.xpath("//span[contains(@id,'Actions_NewAccount')]"); 
	    
	    

              
		//Locating elements using By
        
        public By CompanyName= By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl\']");
       // public By CmpnyNameMatchChkBx=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:CompanyNameExact-inputEl\']");
        public By CmpnyNameMatchChkBx=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:CompanyNameExact-inputEl\']");

        public By FirstName=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl\']");
        public By LastName=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl\']");
        public By FirstNameMatchChkBx=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:FirstNameExact-inputEl\']");
        public By LastNameMatchChkBx=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:LastNameExact-inputEl\']");
        public By Country=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl\']");
        public By City=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl\']");
        public By County=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl\']");
        public By State=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl\']");
        public By Zip=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\']");
        public By SearchBtn=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\']");
        public By ResetBtn=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset\']");
        public By CrtNwAcntBtn=By.xpath("//*[@id=\'NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl\']");
        public By SrchRsltTxt=By.xpath("//div[@id='ext-gen2153']");
        public By NwAccntPrsn=By.xpath("//div[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person']");
        public By NwAccntCmpny=By.xpath("//div[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company']");
        public By NwAccntAdrsBook=By.xpath("//div[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_FromAB']");
        public By crtNewCpmny=By.xpath("//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl']");
        public By crtNewPerson= By.xpath("//span[contains(@id,'NewAccount_Person')]");
        
        //actions on objects
        
        public By CntryName = By.xpath("//input[contains(@id,'Country-input')]");
        private String CountryName = "//li[contains(text(),'{0}')]";
        //public By StateName = By.xpath("//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
        
        public By StateName = By.xpath("//input[contains(@id,'State-input')]");
        private String StName = "//li[contains(text(),'{0}')]";
        
        
        public void enterCompanyName(String CmpnyNm) throws Exception
    {
           	enterText(CompanyName,CmpnyNm);        
    }
    

    public void chkCmpnyNameMatchChkBx() throws Exception
    {
            clickButton(CmpnyNameMatchChkBx);     
    }

    public void enterFirstName(String FrstNm) throws Exception
    {
        
    	  	enterText(FirstName,FrstNm);     
    	        
    }

    public void enterLastName(String LstNm) throws Exception
    {;
       
            enterText(LastName,LstNm);   
    }

    public void chkFirstNameMatchChkBx() throws Exception
    {
        
            clickButton(FirstNameMatchChkBx);   
    }

    public void chkLastNameMatchChkBx() throws Exception
    {
        
            clickButton(LastNameMatchChkBx);   
    }
    
    public void enterCountry(String Cntry) throws Exception
    {
    	
    	   clickButton(CntryName);  
    	   String CntryNm = CountryName.replace("{0}", Cntry);   	 
       	   clickButton(By.xpath(CntryNm));
       	   unconditionalWait(3);
           // enterText(Country,Cntry);
    }

    public void enterCity(String Cty) throws Exception
    {
        
            enterText(City,Cty);
    }

    public void enterCounty(String Cnty) throws Exception
    {
        
    	
    	
            enterText(County,Cnty);
    }

    public void enterState(String St) throws Exception
    {
        

 	       clickButton(StateName);  
 	       unconditionalWait(3);
 	      String StateNm = StName.replace("{0}", St);   	 
    	   clickButton(By.xpath(StateNm));
    	   unconditionalWait(2);
    	
           // enterText(State,St);
    }

    
    public void enterZip(String Zp) throws Exception
    {
        
            enterText(Zip,Zp);
    }

    public void clickSearch() throws Exception
    {

    	clickButton(SearchBtn);   
       
    }

    public void clickReset() throws Exception
    {
    	clickButton(ResetBtn); 
        
    }

    public void clickCrtNwAcnt() throws Exception
    {
        clickButton(CrtNwAcntBtn); 
    }
    
    public String searchResult() throws Exception
    {
    	String SrchRslt=returnText(SrchRsltTxt);
    	return SrchRslt;
    	
    }
    
    public void clickNwAccntPrsn() throws Exception
    {
        clickButton(NwAccntPrsn); 
    }
    
    public void clickNwAccntCmpny() throws Exception
    {
        clickButton(NwAccntCmpny); 
    }
    
    public void clickNwAccntAdrsBook() throws Exception
    {
        clickButton(NwAccntAdrsBook); 
    }
    public void clickAccountDropDown() throws Exception{
    	clickButton(AccountDropDown);
    	
    }
    
    public void clickonActionsTab() throws Exception{
    	clickButton(ActionsTab);
    	
    }
    public void clickonNewAccountLabel() throws Exception{
    	clickButton(NewAccountLabel);
    	
    }
    public void clickCrtCmpany() throws Exception{
    	clickButton(crtNewCpmny);
    }
    
    public void clickCrtPerson() throws Exception{
    	clickButton(crtNewPerson);
    }
    
}



