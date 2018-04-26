package action;

import pages.PaymentPage;
import siteFactory.SiteFactory;


public class PaymentAction {
	private SiteFactory factory;
	
	public PaymentAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void issuePolicy(String billingMthd, String instlmnt) throws Exception
	{
		factory.paymentPage().selectBillingMethod(billingMthd);  
		factory.paymentPage().selectInstallemntPlan(instlmnt);
		factory.paymentPage().clickonBindOptionsDrpDwn();
		factory.paymentPage().clickonIssuePolicyLbl();
		factory.paymentPage().selectOkfrmPopUp();
		
	}


}
