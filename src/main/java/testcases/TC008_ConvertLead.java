package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC008_ConvertLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String city, String vExceptionmsg) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickFindLead()
		.clickAdvancedTab()
		.enterCity(city)
		.clickFindLead()
		.clickLeadId()
		.clickConvertLead()
		.clickConvert()
		.verifyException(vExceptionmsg);

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC008";
		browserName="chrome";
		testCaseName="Convert Lead";
		testDescription="Test Case is to convert existing lead";
	}







}
