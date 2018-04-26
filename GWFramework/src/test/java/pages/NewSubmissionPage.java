package pages;

import functionalComponent.CommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import siteFactory.SiteFactory;

public class NewSubmissionPage extends CommonFunctions{
	
	SiteFactory factory;
	  
	
	   public NewSubmissionPage (SiteFactory factory, WebDriver driver){
		   
		   this.factory= factory;
	   }


	
	//Navigation objects
		public By Organization= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer-inputEl']");
		public By ProducerCode= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']");
		public By SingleBtn= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_true-inputEl']");
		public By MultipleBtn= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_false-inputEl']");
		public By QuoteType= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:QuoteType-inputEl']");
		public By DfltBaseState= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultBaseState-inputEl']");
		public By DfltEfctvDt= By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']");
		
		public By NewSubmissionLabel= By.xpath("//span[contains(@id,'NewSubmission')]");
		
		public By SelectProductBtn;
		
		//to select product based on parameter passed
		public  By selProduct(String Product)
		{
			if(Product=="Businessowners")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission']");
			
			else if(Product=="Commercial Auto")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:1:addSubmission']");
	
			else if(Product=="Commercial Package")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:2:addSubmission']");
	
			else if(Product=="Commercial Property")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:3:addSubmission']");
	
			else if(Product=="General Liability")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:4:addSubmission']");
	
			else if(Product=="Inland Marine")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:5:addSubmission']");
	
			else if(Product=="Workers' Compensation")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:6:addSubmission']");
	
			else if(Product=="Personal Auto")
				SelectProductBtn=By.xpath("//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']");
			
			return SelectProductBtn;
	
		}
		
				
		
		//Navigation methods
		
		public void enterOrganization(String Org) throws Exception
		{
			enterText(Organization,Org);   
		}
		
		public void enterProducerCode(String ProdCode) throws Exception
		{
			enterText(ProducerCode,ProdCode);   
		}
		
		public void clickSingleBtn() throws Exception
	    {

	    	clickButton(SingleBtn);   
	       
	    }

		public void clickMultipleBtn() throws Exception
	    {

	    	clickButton(MultipleBtn);   
	    		       
	    }

		public void enterQuoteType(String QouteTyp) throws Exception
		{
			enterText(QuoteType,QouteTyp);   
		}
		
		public void enterDfltBaseState(String BaseSt) throws Exception
		{
			enterText(DfltBaseState,BaseSt);   
		}

		public void enterDfltEfctvDt(String EfctvDt) throws Exception
		{
			enterText(DfltEfctvDt,EfctvDt);   
		}
		
		public void clickSelectProductBtn(String Product) throws Exception
	    {
			
			By SelectProduct = selProduct(Product);

	    	clickButton(SelectProduct);   
	    		       
	    }
		
		  public void clickonNewSubmissionLabel() throws Exception{
		    	clickButton(NewSubmissionLabel);
		    	
		    }
		
}
