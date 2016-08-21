package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CreateLeadPage enterCompanyname(String data){
		enterById(prop.getProperty("CreateLead.companyname.Id"), data);
		return this;
	}

	public CreateLeadPage enterFirstname(String data){
		enterById(prop.getProperty("CreateLead.firstname.Id"), data);
		return this;
	}

	public CreateLeadPage enterLastname(String data){
		enterById(prop.getProperty("CreateLead.lastname.Id"), data);
		return this;
	}

	public ViewLeadPage clickCreatelead(){
		clickByClassName(prop.getProperty("CreateLead.createlead.class"));
		return new ViewLeadPage();
	}










}
