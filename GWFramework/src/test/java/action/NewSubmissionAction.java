package action;


import siteFactory.SiteFactory;

public class NewSubmissionAction {
	private SiteFactory factory;
	
	public NewSubmissionAction (SiteFactory factory){
		
		this.factory = factory;
	}



	
	public void createSingleSubmission(String ProductName) throws Exception{
        
		factory.newAccountPage().clickonActionsTab();
		factory.newSubmissionPage().clickonNewSubmissionLabel();
		//factory.newSubmissionPage().selProduct(ProductName);
		factory.newSubmissionPage().clickSelectProductBtn(ProductName);
		
		
		

	}

}
