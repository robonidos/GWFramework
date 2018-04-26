package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import siteFactory.SiteFactory;
import functionalComponent.CommonFunctions;

public class PaymentPage extends CommonFunctions {

      SiteFactory factory;
     
      
      public PaymentPage (SiteFactory factory, WebDriver driver){
               
               this.factory= factory;
               
         }
      
        public By BillingMethod = By.xpath("//input[contains(@id,'BillingMethod')]");
       
        
		public By SelectInstallmentPlanBtn;
		
		//to select product based on parameter passed
		public  By selInstallment(String InstallmentName)
		{
			if(InstallmentName=="3 Payments Demo")
				SelectInstallmentPlanBtn=By.xpath("//div[contains(@id,'BillingAdjustmentsInstallmentsLV-body')]//table/tbody/tr[1]/td[1]");
			
			else if(InstallmentName=="6 Payments Demo")
				SelectInstallmentPlanBtn=By.xpath("//div[contains(@id,'BillingAdjustmentsInstallmentsLV-body')]//table/tbody/tr[2]/td[1]");
	
			else if(InstallmentName=="Full Pay")
				SelectInstallmentPlanBtn=By.xpath("//div[contains(@id,'BillingAdjustmentsInstallmentsLV-body')]//table/tbody/tr[3]/td[1]");
	
			else if(InstallmentName=="Twice Per Month Demo")
				SelectInstallmentPlanBtn=By.xpath("//div[contains(@id,'BillingAdjustmentsInstallmentsLV-body')]//table/tbody/tr[4]/td[1]");
	
			
			return SelectInstallmentPlanBtn;
	
		}
		
		 public By BindOptionsDrpDwn = By.xpath("//span[contains(@id,'BindOptions-btn')]");
		 public By IssuePolicyLbl = By.xpath("//span[contains(text(),'Issue Policy')]");
		 public By OkButon = By.xpath("//span[contains(text(),'OK')]");
		 private String CommonXpath = "//li[contains(text(),'{0}')]";
		 
		 
		    public void selectBillingMethod(String BllngMthd) throws Exception
		    {
		    	clickButton(BillingMethod);
		    	String BlngMthdVal = CommonXpath.replace("{0}", BllngMthd);   	 
		    	clickButton(By.xpath(BlngMthdVal));
		    	unconditionalWait(3);
		    }
		    
		    
			public void selectInstallemntPlan(String Installment) throws Exception
		    {
				
				By InsPlan = selInstallment(Installment);
				
				driver.findElement(InsPlan).click();
				unconditionalWait(2);

		    	//clickButton(InsPlan);   
		    		       
		    }
			
			public void clickonBindOptionsDrpDwn() throws Exception
		       {

		         clickButton(BindOptionsDrpDwn);
		         unconditionalWait(3);
		         
		      }
			
			public void clickonIssuePolicyLbl() throws Exception
		       {

		         clickButton(IssuePolicyLbl);
		         unconditionalWait(3);
		         
		      }
			
			public void selectOkfrmPopUp() throws Exception
		       {

		         clickButton(OkButon);
		         unconditionalWait(3);
		         
		      }

		    
		    
}		    
        
        