package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;
import functionalComponent.CommonFunctions;

public class VehiclePage extends CommonFunctions {

      SiteFactory factory;
     
      
      public VehiclePage (SiteFactory factory, WebDriver driver){
               
               this.factory= factory;
               
         }

	
	public By CreateVehicleBtn= By.xpath("//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']");
	public By NextBtn= By.xpath("//*[@id='SubmissionWizard:Next-btnInnerEl']");
	public By VehicleTyp = By.xpath("//input[contains(@id,'VehicleDV:Type')]");
	public By VINInpt= By.xpath("//*[@name='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Vin_DV']");
	public By LicenseStateInpt = By.xpath("//input[contains(@id,'LicenseState')]");			
	public By CostNewInpt= By.xpath("//*[@name='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV']");
	public By AssignDrvrDrpDwn = By.xpath("//span[contains(@id,'Auto_AssignDrivers')]");
	public By FrstDrvrNm = By.xpath("//span[contains(@id,'AddDriver:0')]");
	public By FrstDrvrChkBox = By.xpath("//div[contains(@id,'Auto_AssignDrivers')]//div[contains(@class,'checkcolumn')]");
	
	public By AddVehicleChkBox = By.xpath("//div[contains(@class,'checkcolumn')]");
	public By RemoveVehicleBtn= By.xpath("//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Remove-btnInnerEl']");
	public By AddDrpdown= By.xpath("//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']");
	
	
	private String CommonXpath = "//li[contains(text(),'{0}')]";
	
	
	// Object identification for driver dropdown selection pending
	
	public void clickCreateVehicleBtn() throws Exception
    {

    	clickButton(CreateVehicleBtn);   
    		       
    }
	
	public void selectVehicleType(String VehicleType) throws Exception
    {
    	
		   clickButton(VehicleTyp);  
 	       unconditionalWait(2);
 	       String VType = CommonXpath.replace("{0}", VehicleType);   	 
    	   clickButton(By.xpath(VType));
    	   unconditionalWait(1);  	
    }

	public void clickNextBtn() throws Exception
    {

    	clickButton(NextBtn);   
    		       
    }
	
	public void enterVIN(String VIN) throws Exception
    {
    	enterText(VINInpt,VIN);
    	unconditionalWait(2);
    }
	
	public void selectLicenseState(String LicenseState) throws Exception
    {
    	
		   clickButton(LicenseStateInpt);  
 	       unconditionalWait(2);
 	       String StateNm = CommonXpath.replace("{0}", LicenseState);   	 
    	   clickButton(By.xpath(StateNm));
    	   unconditionalWait(1);  	
    }
	
	public void enterCostNew(String CostNew) throws Exception
    {
		//unconditionalWait(2);
		driver.findElement(CostNewInpt).click();
		unconditionalWait(2);
    	enterText(CostNewInpt,CostNew);    	
    }
	
	public void clickAddDriverDrpdwnBtn() throws Exception
    {

    	clickButton(AssignDrvrDrpDwn);   
    		       
    }
	
	public void selectFrstDrvr() throws Exception
    {

    	clickButton(FrstDrvrNm); 
    	unconditionalWait(1);
    		       
    }
	
	public void clickFrstDrvChkBox() throws Exception
    {

    	clickButton(FrstDrvrChkBox);   
    		       
    }
	
	
	
	public void clickAddVehicleChkBox() throws Exception
    {

    	clickButton(AddVehicleChkBox);   
    		       
    }
	
	
	public void clickRemoveVehicleBtn() throws Exception
    {

    	clickButton(RemoveVehicleBtn);   
    		       
    }
	
	public void clickAddDrpdown() throws Exception
    {

    	clickButton(AddDrpdown);   
    		       
    }
	
	
}
