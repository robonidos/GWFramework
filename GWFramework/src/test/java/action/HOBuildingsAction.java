package action;
import siteFactory.SiteFactory;

public class HOBuildingsAction {
	private SiteFactory factory;
	
	public HOBuildingsAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void selectOffering(String OfrgSelection) throws Exception
	{
		factory.offeringsPage().enterOfferingSelection(OfrgSelection);
		factory.offeringsPage().clickNextBtn();
		
	}
}

