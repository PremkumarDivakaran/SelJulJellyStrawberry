package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String compName, String firstName, String lastName,
			String vFname) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyname(compName)
		.enterFirstname(firstName)
		.enterLastname(lastName)
		.clickCreatelead()
		.verifyFirstname(vFname);

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Create Lead";
		testDescription="Test Case is to creating new lead";
	}







}
