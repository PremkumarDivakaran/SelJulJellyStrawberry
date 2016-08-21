package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadPage extends OpentapsWrappers{

	public MyLeadPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Lead Page", "FAIL");
	}	

	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("MyLead.createLead.LinkText"));
		return new CreateLeadPage();
	}

	public FindLeadPage clickFindLead(){
		clickByLink(prop.getProperty("MyLead.editLead.LinkText"));
		return new FindLeadPage();
	}

	public MergeLeadPage clickMergeLead(){
		clickByLink(prop.getProperty("MyLead.mergeLead.LinkText"));
		return new MergeLeadPage();
	}











}
