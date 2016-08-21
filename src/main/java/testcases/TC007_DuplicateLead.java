package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_DuplicateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String emailId) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(emailId)
		.clickFindLead()
		.leadCountBeforeDuplicate()
		.clickLeadId()
		.clickDuplicateLead()
		.createLeadButton()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(emailId)
		.clickFindLead()
		.leadCountAfterDuplicate()
		.verifyDuplicate();

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007";
		browserName="chrome";
		testCaseName="Duplicate Lead";
		testDescription="Test Case is to duplicate existing lead";
	}







}
