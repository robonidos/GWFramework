package action;

import pages.PolicyInfoPage;
import siteFactory.SiteFactory;


public class PolicyInfoAction {
	private SiteFactory factory;
	
	public PolicyInfoAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void updatePolicyInfo(String TermTypeValue, String EffDate, String WrttnDate, String SSNValue ) throws Exception
	{
	 
		factory.policyInfoPage().selectTermType(TermTypeValue);
		factory.policyInfoPage().enterEffectiveDate(EffDate);
		factory.policyInfoPage().enterWrittenDate(WrttnDate);
		factory.policyInfoPage().enterSSN(SSNValue);	
		factory.policyInfoPage().clickNextBtn();
		
	}
	/*
	public void enterPolicyQuoteDate(String QuoteDate) throws Exception
	{
		enterQuoteDate(QuoteDate);
		   
	}
	
	public void cancelAccountInfo() throws Exception
	{
		clickCancelBtn() ;
	} */
	


		

}
