package wrappers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;
import utils.Reporter;

public class OpentapsWrappers extends GenericWrappers {

	protected String browserName;
	protected String dataSheetName;
	protected static String testCaseName;
	protected static String testDescription;

	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException{
		Reporter.startResult();
		loadObjects();
	}

	@BeforeTest
	public void beforeTest(){

	}

	@BeforeMethod
	public void beforeMethod(){
		Reporter.startTestCase();
		invokeApp(browserName);
	}

	@AfterSuite
	public void afterSuite(){
		Reporter.endResult();
	}

	@AfterTest
	public void afterTest(){

	}

	@AfterMethod
	public void afterMethod(){
		quitBrowser();
	}

	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}

	public int getLeadCount(String xpathVal) {
		int n=0;
		try {
			List<WebElement> listItems = driver.findElementsByXPath(xpathVal);
			n = listItems.size();
			Reporter.reportStep("The elements with xpath: "+xpathVal+" are found", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("The elements with xpath: "+xpathVal+" could not be found", "PASS");
		} 
		return n;
	}

	public boolean verifyTextContainsByXpath_convertLead(String xpath, String text){
		boolean bReturn = false;
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
			Reporter.reportStep("The text: "+sText+" contains the value :"+text, "FAIL");
			bReturn = true;
		}else{
			Reporter.reportStep("The text: "+sText+" did not contain the value :"+text, "INFO");
		}
		return bReturn;
	}
}
