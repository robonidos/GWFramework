package action;
import pages.CreateAccountPage;
import siteFactory.SiteFactory;

public class CreateAccountAction  {
	
	private SiteFactory factory;
	
	public CreateAccountAction (SiteFactory factory){
		
		this.factory = factory;
	}
	public void updateAccountInfo(String FrstNm,String LstNm,String Adrs1,String State,String ZipCode,String addrType,String OrgNm) throws Exception
	{
		
		
		//factory.createAccountPage().enterFirstName(FrstNm);	    
		factory.createAccountPage().enterLastName(LstNm);	    
		factory.createAccountPage().enterAddress1(Adrs1);	
		//factory.createAccountPage().enterState(State);
		//factory.createAccountPage().enterZipCode(ZipCode);
		factory.createAccountPage().enterAddressType(addrType) ;	    
		//clickOrgSrchBtn() ;
	    factory.createAccountPage().enterOrgName(OrgNm) ;	    
		//clickOrganizationSearchBtn() ;
	    //clickSrchRsltSlctBtn() ;    
	    //enterProducerCode(PrdcrCode); 
	    factory.createAccountPage().clickUpdateBtn() ;   
	    
	}
	
	public void cancelAccountInfo() throws Exception
	{
		factory.createAccountPage().clickCancelBtn() ;
	}

}
