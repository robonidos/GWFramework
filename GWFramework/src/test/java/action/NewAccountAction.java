package action;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import functionalComponent.CommonFunctions;
import pages.NewAccountPage;
import siteFactory.SiteFactory;

public class NewAccountAction {
	private SiteFactory factory;
	
	public NewAccountAction (SiteFactory factory){
		
		this.factory = factory;
	}

	

	//Method to enter information and clicking search, getting search result msg
	public void searchAccntInfo(String CmpnyNm,String FrstNm,String LstNm,String Cntry,String Cty,String Cnty,String St,String Zp) throws Exception{

		
		//ArrayList<String> newAccountInfo = CommonFunctions.getValueFromExcelSheet();
		factory.newAccountPage().clickonActionsTab();
		factory.newAccountPage().clickonNewAccountLabel();
		factory.newAccountPage().enterCompanyName(CmpnyNm);	    
		//factory.newAccountPage().chkCmpnyNameMatchChkBx();
		factory.newAccountPage().enterFirstName(FrstNm);
		factory.newAccountPage().enterLastName(LstNm);
		//factory.newAccountPage().chkFirstNameMatchChkBx();
		//factory.newAccountPage().chkLastNameMatchChkBx();
		factory.newAccountPage().enterCountry( Cntry);
		//factory.newAccountPage().enterCity(Cty);
		//factory.newAccountPage().enterCounty(Cnty);
		factory.newAccountPage().enterState(St);	    
		//factory.newAccountPage().enterZip(Zp);
		factory.newAccountPage().clickSearch();
		//factory.newAccountPage().clickReset();
		factory.newAccountPage().clickCrtNwAcnt();
		factory.newAccountPage().clickCrtPerson();
		//String SrchRslt=factory.newAccountPage().searchResult();
	}
	
	public void createNewAccountCmpny(String CmpnyNm,String FrstNm,String LstNm,String Cntry,String Cty,String Cnty,String St,String Zp) throws Exception{
		
		factory.newAccountPage().enterCompanyName(CmpnyNm);	    
		factory.newAccountPage().chkCmpnyNameMatchChkBx();
		factory.newAccountPage().enterFirstName(FrstNm);
		factory.newAccountPage().enterLastName(LstNm);
		factory.newAccountPage().chkFirstNameMatchChkBx();
		factory.newAccountPage().chkLastNameMatchChkBx();
		factory.newAccountPage().enterCountry(Cntry);
		factory.newAccountPage().enterCity(Cty);
		factory.newAccountPage().enterCounty(Cnty);
		factory.newAccountPage().enterState(St);	    
		factory.newAccountPage().enterZip(Zp);
		factory.newAccountPage().clickSearch();
		factory.newAccountPage().clickReset();
		factory.newAccountPage().clickCrtNwAcnt();
		String SrchRslt=factory.newAccountPage().searchResult();
		factory.newAccountPage().clickNwAccntCmpny();
				
	}

public void createNewAccountPerson(String CmpnyNm,String FrstNm,String LstNm,String Cntry,String Cty,String Cnty,String St,String Zp) throws Exception{
		
	    factory.newAccountPage().enterCompanyName(CmpnyNm);	    
	    factory.newAccountPage().chkCmpnyNameMatchChkBx();
	    factory.newAccountPage().enterFirstName(FrstNm);
	    factory.newAccountPage().enterLastName(LstNm);
	    factory.newAccountPage().chkFirstNameMatchChkBx();
	    factory.newAccountPage().chkLastNameMatchChkBx();
	    factory.newAccountPage().enterCountry( Cntry);
	    factory.newAccountPage().enterCity(Cty);
	    factory.newAccountPage().enterCounty(Cnty);
	    factory.newAccountPage().enterState(St);	    
	    factory.newAccountPage().enterZip(Zp);
	    factory.newAccountPage().clickSearch();
	    factory.newAccountPage().clickReset();
	    factory.newAccountPage().clickCrtNwAcnt();
		String SrchRslt=factory.newAccountPage().searchResult();
		factory.newAccountPage().clickNwAccntPrsn();	
	
}
}
