package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import functionalComponent.CommonFunctions;
import siteFactory.SiteFactory;

public class RiskAnalysisPage extends CommonFunctions{
	
	SiteFactory factory;
	  
	
	   public RiskAnalysisPage (SiteFactory factory, WebDriver driver){
		   
		   this.factory= factory;
	   }

              
              public By BackButton = By.xpath("//*[contains(@id , 'Prev')]");
              public By NextButton = By.xpath("//*[contains(@id , 'Next')]");
              //For UWIssues tab
              public By UWIssues = By.xpath("//span[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:EvaluationIssuesCardTab-btnInnerEl']");
                           public By ApproveUWIssue = By.xpath("//span[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:Approve-btnInnerEl']");
                           public By RejectUWIssue = By.xpath("//span[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:Reject-btnInnerEl']");
                           public By ReopenUWIssue = By.xpath("//span[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:Reopen-btnInnerEl']");
                           public By HistoryUWIssue = By.xpath("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:History-btnInnerEl");
                           public By ViewUserIssuesList = By.xpath("//*[contains(@id,'UserView' )]");
                           public By ViewIssuesBlocking = By.xpath("//input[contains(@id,'UserViewFilter')]");
                           //public By ViewIssuesBlockingMe = By.xpath("//ul[@class='x-list-plain']/li[@id = 'ext-gen4289']");
                           //public By ViewIssueBlockingAll = By.xpath("//ul[@class='x-list-plain']/li[@class = 'x-boundlist-item']");
              
              //For PriorPolicy tab
              public By PriorPolicy = By.xpath("//span[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:PriorPolicyCardTab-btnInnerEl']");
                            public By AddPriorPolicy = By.xpath("//span[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:PriorHistoryDV:PriorPolicyLV_tb:Add-btnInnerEl']");
                            public By RemovePriorPolicy = By.xpath("//span[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:PriorHistoryDV:PriorPolicyLV_tb:Remove-btnInnerEl']");
                            //Need to check if column sorting and filter is required to be identified
              //For Claims tab
              public By Claims = By.xpath("//span[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:ClaimsCardTab-btnInnerEl']");
                           public By SearchClaimByRelatedPolicy = By.xpath("//input[@name = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:PolicyNumberPicker']");
                           public By ClaimDateRangeRadioButton = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:DateRangeForClaimSearch:DateRangeForClaimSearchRangeChoice_Choice-inputEl']");
                                         public By ClaimStartDateRange = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:DateRangeForClaimSearch:DateRangeForClaimSearchStartDate-inputEl']");
                                         public By ClaimEndDateRange = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:DateRangeForClaimSearch:DateRangeForClaimSearchEndDate-inputEl']");
                           public By ClaimSincedateRadioButton = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:DateRangeForClaimSearch:DateRangeForClaimSearchRangeChoice_Choice-inputEl']");
                                         public By ClaimSinceDate = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:DateRangeForClaimSearch:DateRangeForClaimSearchRangeValue-inputEl']");         
                           public By ClaimsSearchButton = By.xpath("//a[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
                           public By ClaimsResetButton = By.xpath("//a[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:SearchAndResetInputSet:SearchLinksInputSet:Reset']");
                           public By PolicyPeriodDropdown = By.xpath("//input[@id = 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:ClaimsLV:policyPeriodFilter-inputEl']");
              
              //For PriorLoss tab
              public By PriorLosses = By.xpath("//span[@id= 'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:LossHistoryCardTab-btnInnerEl']");
              public By LossHstryType = By.xpath("//input[contains(@id,'LossHistoryType')]");
              
              private String CommonXpath = "//li[contains(text(),'{0}')]";
              
              //Actions on Objects
              
              
              public void SelViewIssuesBlckVal(String ViewIssVal) throws Exception
              {
                      clickButton(ViewIssuesBlocking); 
                      String ViewIssueBlck = CommonXpath.replace("{0}", ViewIssVal);
                      clickButton(By.xpath(ViewIssueBlck));
                      unconditionalWait(2);
              }
              
              
              
              public void clickBackButton() throws Exception
                   {
        
            clickButton(BackButton);   
                  }

              public void clickNextButton() throws Exception
    {
        
            clickButton(NextButton);  
            unconditionalWait(2);
    }

              public void clickOnUWIssues() throws Exception
    {
        
            clickButton(UWIssues);   
    }
              
                           public void clickOnApproveUWIssue () throws Exception
              {
                           clickButton(ApproveUWIssue);
              }
              
                           public void clickOnRejectUWIssue () throws Exception
              {
                           clickButton(RejectUWIssue);
              }
              
                           public void clickOnReopenUWIssue () throws Exception
              {
                           clickButton(ReopenUWIssue);
              }

                           public void clickOnHistoryUWIssue () throws Exception
              {
                           clickButton(HistoryUWIssue);
              }

                           public void selectUserIssue(String UserIssueValue) throws Exception
   {
         selectFromDropdown(ViewUserIssuesList,UserIssueValue);                  
   }
              
              public void clickOnPriorPolicy() throws Exception
    {
        
            clickButton(PriorPolicy);   
    }
              
                           public void clickONAddPriorPolicy () throws Exception
                           {
                                         clickButton(AddPriorPolicy);
                           }

                           public void clickOnRemovePriorPolicy () throws Exception
                           {
                                         clickButton(RemovePriorPolicy);
                           }
                           
                           
              public void clickOnClaims() throws Exception
    {
        
            clickButton(Claims);   
    }
              
              public void clickOnPriorLosses () throws Exception
              {
                           clickButton(PriorLosses);
              }
              
              public void SelLossHistoryType(String LsHstryTyp) throws Exception
              {
                      clickButton(LossHstryType); 
                      String LsHstryssueBlck = CommonXpath.replace("{0}", LsHstryTyp);
                      clickButton(By.xpath(LsHstryssueBlck));
                      unconditionalWait(2);
              }
              
              
}
