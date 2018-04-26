package pages;

import org.openqa.selenium.By;
import functionalComponent.CommonFunctions;

public class NewSubmissionNavigationPage extends CommonFunctions{
	
	//Navigation objects
	public By ActionBtn= By.xpath("//*[@id='AccountFile:AccountFileMenuActions-btnInnerEl']");
	public By NewSubmissionBtn= By.xpath("//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl']");
	
	
	//Navigation methods
	
	public void clickActionBtn() throws Exception
	{
		clickButton(ActionBtn);  
	}
	
	public void clickNewSubmissionBtn() throws Exception
    {

    	clickButton(NewSubmissionBtn);   
       
    }

	
}
