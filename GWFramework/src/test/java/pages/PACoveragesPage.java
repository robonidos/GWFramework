package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import gwtest.*;
import siteFactory.SiteFactory;
import functionalComponent.CommonFunctions;


public class PACoveragesPage extends CommonFunctions{
              SiteFactory factory;
              public static WebDriver driver;
              
              public PACoveragesPage (SiteFactory factory, WebDriver driver){
                              
                              this.factory= factory;
                              this.driver = driver;
                 }
              
               //Locators
     public By BackButton = By.xpath("//span[contains(text(), 'Back')]");
     public By NextButton = By.xpath("//span[contains(text(), 'Next')]");
     public By CoverageTab = By.xpath("//span[contains(@id,'CoveragesTab')]");
     public By AddtnlCovrgTab = By.xpath("//span[contains(@id,'AdditionalCoveragesTab')]");
     public By AddCvrgRentCarLoss = By.xpath("//input[contains(@id,'CoverageInputSet:CovPatternInputGroup')]");
     
     public By AutoLbltyDrpDwn = By.xpath("//input[contains(@id,'Liability')]");
     private String AutoLblt = "//li[contains(text(),'{0}')]";
     
     public By MedPymntDrpDwn = By.xpath("//input[contains(@id,'PALiabCategoryIterator:1')]/following::input[contains(@type,'text')]");         
     private String MedPt =  "//li[contains(text(),'{0}')]";     

     public By UnInsrdMtrDrpDwn = By.xpath("//input[contains(@id,'SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl')]");
     private String UnInMtr = "//li[contains(text(),'{0}')]";

     public By RentCarLossDrpDwn = By.xpath("//input[contains(@id,'SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PALineAdditionalCoveragesDV:0:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl')]");
     
     //Methods
     public void clickBackBtn() throws Exception
             {
                          clickButton(BackButton); 
              }
             public void clickNextBtn() throws Exception
             {
                          clickButton(NextButton); 
              }
    public void clickCvrgTab() throws Exception
    {
              clickButton(CoverageTab);
    }
    
    public void clickAddCvrgTab() throws Exception
    {
              clickButton(AddtnlCovrgTab);
    }
    
     public void SelAutoLiabilityPkg(String LiabltyPkgval) throws Exception
     {
             clickButton(AutoLbltyDrpDwn); 
             String Liability = AutoLblt.replace("{0}", LiabltyPkgval);
             clickButton(By.xpath(Liability));
             unconditionalWait(2);
     }
     public void SelMedPaymnt(String MedPaymntval) throws Exception
     {
               clickButton(MedPymntDrpDwn);
               String MedicalPymnt = MedPt.replace("{0}", MedPaymntval);
               clickButton(By.xpath(MedicalPymnt));
               unconditionalWait(2);
     }
     
     public void SelUninsrdMotr(String val) throws Exception
     {
                            clickButton(UnInsrdMtrDrpDwn);
                            String UnInsrdMotr = UnInMtr.replace("{0}",val);
                            clickButton(By.xpath(UnInsrdMotr));
     }
     
     
     
               
}
