package action;
import siteFactory.SiteFactory;

public class HOLocationsAction {
	private SiteFactory factory;
	
	public HOLocationsAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void selectLocations() throws Exception
	{
		factory.locationsPage().clickLocationCheckbox();
		factory.locationsPage().clickNextBtn();
		
	}
}

