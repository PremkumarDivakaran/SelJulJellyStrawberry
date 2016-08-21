package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, String vUser, 
			String Lead1Fname, String Lead2Fname, String vMessage) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickMergeLead()
		.clickFromButton()
		.switchFindLead_MergeLeadWindow()
		.enterFirstName(Lead1Fname)
		.clickFindButton()
		.clickFirstLeadId()
		.switchMergeLeadWindow()
		.clickToButton()
		.switchFindLead_MergeLeadWindow()
		.enterFirstName(Lead2Fname)
		.clickFindButton()
		.clickFirstLeadId()
		.switchMergeLeadWindow()
		.clickMergeButton()
		.clickFindLead()
		.enterFirstName(Lead1Fname)
		.clickFindLead()
		.verifyNoRecordMessage(vMessage);

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="chrome";
		testCaseName="Merge Lead";
		testDescription="Test Case is to merge two existing lead";
	}







}
