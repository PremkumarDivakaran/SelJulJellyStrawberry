package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String firstName, String Industry,
			String vIndustry) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLead()
		.waitForFindResult()
		.clickLeadId()
		.clickEdit()
		.enterIndustryDetails(Industry)
		.clickUpdate()
		.verifyIndustry(vIndustry);

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Edit Lead";
		testDescription="Test Case is to edit existing lead";
	}







}
