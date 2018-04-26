package action;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;


public class VehicleAction {
private SiteFactory factory;
      
      public VehicleAction (SiteFactory factory){
            
            this.factory = factory;
      }


	public void addVehicle(String VehicleType, String VIN, String LicenseState, String CostNew) throws Exception
	{
		factory.vehiclePage().clickCreateVehicleBtn();
		factory.vehiclePage().selectVehicleType(VehicleType);
		factory.vehiclePage().enterVIN(VIN);
		factory.vehiclePage().enterCostNew(CostNew);
		factory.vehiclePage().selectLicenseState(LicenseState);
		factory.vehiclePage().clickAddDriverDrpdwnBtn();
		factory.vehiclePage().selectFrstDrvr();
		factory.vehiclePage().clickFrstDrvChkBox();
		factory.vehiclePage().clickAddVehicleChkBox();
		factory.vehiclePage().clickNextBtn();

		
	
	}
}
