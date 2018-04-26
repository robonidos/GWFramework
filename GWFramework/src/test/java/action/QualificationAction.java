package action;
import siteFactory.SiteFactory;


public class QualificationAction {
	private SiteFactory factory;
	
	public QualificationAction (SiteFactory factory){
		
		this.factory = factory;
	}

	public void qualificationSelect() throws Exception
	{
		
		factory.qualificationPage().clickNextBtn();
	}
	
}
