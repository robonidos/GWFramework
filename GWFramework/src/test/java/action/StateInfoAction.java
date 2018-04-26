package action;
import siteFactory.SiteFactory;

public class StateInfoAction {
	private SiteFactory factory;
	
	public StateInfoAction (SiteFactory factory){
		
		this.factory = factory;
	}


	
	public void enterCoverages(String BdlyInjry,String PrprtyDmg) throws Exception
	{
		factory.stateInfoPage().enterBodilyInjury(BdlyInjry);
		factory.stateInfoPage().enterPropertyDamage(PrprtyDmg);
		factory.stateInfoPage().clickNextBtn();
	}
}

