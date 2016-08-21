package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String firstName, String vMessage) throws InterruptedException {

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
		.clickLeadId()
		.clickDelete()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLead()
		.verifyNoRecordMessage(vMessage);

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Delete Lead";
		testDescription="Test Case is to delete existing lead";
	}







}
