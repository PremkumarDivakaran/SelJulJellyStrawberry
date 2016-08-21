package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLead extends OpentapsWrappers{

	public EditLead() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Edit Lead Page", "FAIL");
	}

	public EditLead enterTitle(String text){
		enterByXpath(prop.getProperty("EditLead.title.Xpath"), text);
		return this;
	}
	
	public EditLead enterIndustryDetails(String value){
		selectById(prop.getProperty("EditLead.industry.Id"), value);
		return this;
	}

	public ViewLeadPage clickUpdate(){
		clickByXpath(prop.getProperty("EditLead.editbutton.Xpath"));
		return new ViewLeadPage();
	}












}
