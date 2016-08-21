package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{
	public static int leadCountBD;
	public static int leadCountAD;

	public FindLeadPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Lead Page", "FAIL");
	}	

	public FindLeadPage enterFirstName(String data){
		enterByXpath(prop.getProperty("FindLead.firstName.Xpath"), data);
		return this;
	}

	public FindLeadPage clickFindLead() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLead.findLead.Xpath"));
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadPage waitForFindResult(){
		webdriverWaitElementTobeClikcable(prop.getProperty("FindLead.LeadId.Xpath"));
		return this;
	}

	public ViewLeadPage clickLeadId(){
		clickByXpath(prop.getProperty("FindLead.LeadId.Xpath"));
		return new ViewLeadPage();
	}

	public FindLeadPage verifyNoRecordMessage(String text){
		verifyTextByXpath(prop.getProperty("FindLead.Norecord.Xpath"), text);
		return this;
	}

	public FindLeadPage clickEmailTab(){
		clickByXpath(prop.getProperty("FindLead.emailTab.Xpath"));
		return this;
	}
	
	public FindLeadPage enterEmailId(String data){
		enterByName(prop.getProperty("FindLead.enterEmail.Name"), data);
		return this;
	}
	
	public FindLeadPage leadCountBeforeDuplicate(){
		leadCountBD = getLeadCount(prop.getProperty("FindLead.numberofMatchingLeads.Xpath"));
		//System.out.println("Before Duplicate: "+leadCountBD);
		return this;
	}

	public FindLeadPage leadCountAfterDuplicate(){
		leadCountAD = getLeadCount(prop.getProperty("FindLead.numberofMatchingLeads.Xpath"));
		//System.out.println("After Duplicate: "+leadCountAD);
		return this;
	}

	public FindLeadPage verifyDuplicate(){				
		if (leadCountAD==leadCountBD+1) {
			Reporter.reportStep("Duplicate lead is success", "PASS");
		}else
		{
			Reporter.reportStep("Duplicate lead NOT success", "FAIL");
		}
		return this;
	}

	public FindLeadPage clickAdvancedTab(){
		clickByXpath(prop.getProperty("FindLead.advancedTab.Xpath"));
		return this;
	}
	
	public FindLeadPage enterCity(String data){
		enterByXpath(prop.getProperty("FindLead.city.Xpath"), data);
		return this;
	}


}
