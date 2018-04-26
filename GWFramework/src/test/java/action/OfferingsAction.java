package action;
import pages.OfferingsPage;
import siteFactory.SiteFactory;

public class OfferingsAction {
	private SiteFactory factory;
	
	public OfferingsAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void selectOffering(String OfrgSelection) throws Exception
	{
		factory.offeringsPage().enterOfferingSelection(OfrgSelection);
		factory.offeringsPage().clickNextBtn();
		
	}
}

