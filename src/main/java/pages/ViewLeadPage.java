package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	

	public ViewLeadPage verifyFirstname(String text){
		verifyTextById(prop.getProperty("ViewLead.firstname.id"), text);
		return this;
	}

	public EditLead clickEdit(){
		clickByLink(prop.getProperty("ViewLead.editLead.LinkText"));
		return new EditLead();
	}

	public ViewLeadPage verifyTitleField(String text){
		verifyTextById(prop.getProperty("ViewLead.verifyTitle.Id"), text);
		return this;
	}

	public ViewLeadPage verifyIndustry(String text){
		verifyTextById(prop.getProperty("ViewLead.verifyIndustry.Id"), text);
		return this;
	}

	public MyLeadPage clickDelete(){
		clickByLink(prop.getProperty("ViewLead.deleteLead.LinkText"));
		return new MyLeadPage();
	}

	public FindLeadPage clickFindLead(){
		clickByLink(prop.getProperty("ViewLead.findLead.LinkText"));
		return new FindLeadPage();
	}

	public DuplicateLeadPage clickDuplicateLead(){
		clickByLink(prop.getProperty("ViewLead.duplicateLead.LinkText"));
		return new DuplicateLeadPage();
	}
	
	public ViewLeadPage clickQualifyLead(){
		clickByLink(prop.getProperty("ViewLead.qualifyLead.LinkText"));
		return this;
	}
	
	public ConvertLeadPage clickConvertLead(){
		clickByLink(prop.getProperty("ViewLead.convertLead.LinkText"));
		return new ConvertLeadPage();
	}


}
