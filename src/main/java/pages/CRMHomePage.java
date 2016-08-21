package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

	public MyLeadPage clickLead(){
		clickByLink(prop.getProperty("CRMHome.Lead.LinkText"));
		return new MyLeadPage();
	}














}
