package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class util {
	
	public String readconfigValue(String Key){
		String value= null;
			try {
				
				FileInputStream f= new FileInputStream("C:\\Users\\ritaghosh\\workspace\\GuidewareAutomationProject\\src\\main\\java\\configuration\\Config.properties");
				Properties prop= new Properties();
				prop.load(f);
				value= prop.getProperty(Key);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
			
	}
		
			
	public String readObjValue(String Key){
		String value= null;
		try {
			String locatorValue= null;
			String objVal= null;
			FileInputStream f= new FileInputStream("C:\\Users\\guarora\\Desktop\\Selenium Training\\Training\\src\\webdriver\\objProp.properties");
			Properties prop= new Properties();
			prop.load(f);
			value= prop.getProperty(Key);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	/*
	public void executeKeyword(WebDriver driver,String keywordName, String IdentificationType, String ObjectID, String value ){
		KeywordLibrary k= new KeywordLibrary();
		
		if (keywordName.equals("enter_text")){
			k.enter_text(driver, IdentificationType, ObjectID, value);
		} else if (keywordName.equals("click")){
			k.click(driver, IdentificationType, ObjectID);
		}
	} */
	
	
	
	
}

