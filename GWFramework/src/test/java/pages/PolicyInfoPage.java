	package pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By;
	import functionalComponent.CommonFunctions;
	import siteFactory.SiteFactory;

	public class PolicyInfoPage extends CommonFunctions{
		
		SiteFactory factory;
		  
		
		   public PolicyInfoPage (SiteFactory factory, WebDriver driver){
			   
			   this.factory= factory;
		   }
		
		
		public By DateQuoteNeeded= By.xpath("//*[contains(@id,'DateQuoteNeeded')]//*[contains(@type,'text')]");
		public By Phone= By.xpath("//*[contains(@id,'Phone:GlobalPhoneInputSet')]//*[contains(@type,'text')]");
		public By SSN= By.xpath("//*[contains(@id,'OfficialIDDV_Input-input')]//*[contains(@type,'text')]");
		//public By TermType= By.xpath("//*[contains(@id,'PolicyInfoInputSet:TermType')]//*[contains(@type,'text')]");
        public By EffectiveDate = By.xpath("//*[contains(@id,'EffectiveDate')]//*[contains(@type,'text')]");
        public By WrittenDate = By.xpath("//*[contains(@id,'WrittenDate')]//*[contains(@type,'text')]");
        public By Organization = By.xpath("//*[contains(@id,'Producer-input')]//*[contains(@type,'text')]");
        public By ProducerCode = By.xpath("//*[contains(@id,'ProducerCode-input')]//*[contains(@type,'text')]");
        public By OrganizationType = By.xpath("//*[contains(@id,'OrganizationType')]//*[contains(@type,'text')]");
       // public By NextBtn= By.xpath("//span[contains(@id,'SubmissionWizard:Next-btnEl')]");
        public By NextBtn= By.xpath("//span[contains(text(), 'Next')]");
        
        public By TermType = By.xpath("//input[contains(@id,'TermType-input')]");
        private String TermTypVal = "//li[contains(text(),'{0}')]";
        
        
        public void enterQuoteDate(String QuoteDate) throws Exception
        {
        	enterText(DateQuoteNeeded,QuoteDate);    	
        }
        
        public void enterPhoneNo(String PhoneNo) throws Exception
        {
        	enterText(Phone,PhoneNo);    	
        }
        
        public void enterSSN(String SSNValue) throws Exception
        {
        	enterText(SSN,SSNValue);    	
        }
        
        public void selectTermType(String TermTypeValue) throws Exception
        {
        	  clickButton(TermType);  
       	      String TermTyp = TermTypVal.replace("{0}", TermTypeValue);   	 
          	   clickButton(By.xpath(TermTyp));
          	   unconditionalWait(3);
        	
        	
        	//selectFromDropdown(TermType,TermTypeValue);    	
        }
        
        public void enterEffectiveDate(String EffDate) throws Exception
        {
        	
        	cleartextbox(EffectiveDate);
        	enterText(EffectiveDate,EffDate);  
        	unconditionalWait(2);
        }
        
        public void enterWrittenDate(String WrttnDate) throws Exception
        {
        	cleartextbox(WrittenDate);
        	enterText(WrittenDate,WrttnDate); 
        	unconditionalWait(2);
        }
        
        public void enterOrganization(String OrganizationName) throws Exception
        {
        	enterText(Organization,OrganizationName);    	
        }
        
        public void selectProducerCode(String ProdCode) throws Exception
        {
        	selectFromDropdown(ProducerCode,ProdCode);    	
        }
        
        public void selectOrganizationType(String OrgType) throws Exception
        {
        	selectFromDropdown(OrganizationType,OrgType);    	
        }
        
    	public void clickNextBtn() throws Exception
        {
    		unconditionalWait(2);

        	clickButton(NextBtn);   
        		       
        }
        
        
        
        
}
