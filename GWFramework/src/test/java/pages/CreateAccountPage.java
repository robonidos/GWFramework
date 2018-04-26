package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class CreateAccountPage extends CommonFunctions{
		
		SiteFactory factory;
		  
		
		   public CreateAccountPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }
	
	//Locating elements using By
    public By FirstName= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:Name-inputEl']");
    public By LastName= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl']");
    public By Address1= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
    //public By AddressType= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']");
    public By OrgSrchBtn= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']");
    public By OrgName= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer-inputEl']");
    public By OrganizationSearchBtn= By.xpath("//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
    public By SrchRsltSlctBtn= By.xpath("//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']");
    public By ProducerCode= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl']");
    public By UpdateBtn= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']");
    public By CancelBtn= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:Cancel-btnInnerEl']");
    public By newState= By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
    public By newZipCode = By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']");
    //Actions on objects
    public By StateTypeDropdown = By.xpath("//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputCell']/following-sibling::td/div"); 
   // public By Statefield = By.xpath("//*[contains(text(),'{0}')]"); 
    private String Statefield = "//*[contains(text(),'{0}')]";
    public By AddrssType = By.xpath("//input[contains(@id,'AddressType-input')]");
    private String AddrssTypDrpDwn = "//li[contains(text(),'{0}')]";
    
    
    
    public void enterFirstName(String FrstNm) throws Exception
    {
    	enterText(FirstName,FrstNm);    	
    }
    public void enterState(String State) throws Exception
    {
    	clickButton(StateTypeDropdown);
    	String Statecode = Statefield.replace("{0}", State);   	 
    	clickButton(By.xpath(Statecode));
    }
    public void enterZipCode(String ZipCode) throws Exception
    {
    	enterText(newZipCode,ZipCode);
    }
    public void enterLastName(String LstNm) throws Exception
    {
    	enterText(LastName,LstNm);    	
    }
    
    public void enterAddress1(String Adrs1) throws Exception
    {
    	enterText(Address1,Adrs1);    	
    }
    
    public void enterAddressType(String addrType) throws Exception
    {
    	
    	clickButton(AddrssType);
    	String AddrTypeVal = AddrssTypDrpDwn.replace("{0}", addrType);   	 
    	clickButton(By.xpath(AddrTypeVal));
    	
    	
    	
    	//enterText(AddressType,addrType);    	
    }
    
    public void clickOrgSrchBtn() throws Exception
    {
        
            clickButton(OrgSrchBtn);   
    }
    
    public void enterOrgName(String OrgNm) throws Exception
    {
    	enterText(OrgName,OrgNm);    	
    }
    
    public void clickOrganizationSearchBtn() throws Exception
    {
        
            clickButton(OrganizationSearchBtn);   
    }
    
       
    public void clickSrchRsltSlctBtn() throws Exception
    {
        
            clickButton(SrchRsltSlctBtn);   
    }
    
    
    public void enterProducerCode(String PrdcrCode) throws Exception
    {
    	enterText(ProducerCode,PrdcrCode);    	
    }
    
    
    public void clickUpdateBtn() throws Exception
    {
        
            clickButton(UpdateBtn);   
    }
    
    
    public void clickCancelBtn() throws Exception
    {
        
            clickButton(CancelBtn);   
    }
    
}
