package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLead_MergeLeadPage extends OpentapsWrappers{

	public FindLead_MergeLeadPage() {
		if(!verifyUrl("http://demo1.opentaps.org/crmsfa/control/LookupLeads?id=&parm0=LookupLeads"))
			Reporter.reportStep("This is not Find Lead_Merge Lead Page", "FAIL");
	}

	public FindLead_MergeLeadPage enterFirstName(String data){
		enterByXpath(prop.getProperty("FindLead_MergeLead.firstName.Xpath"), data);
		return this;
	}

	public FindLead_MergeLeadPage clickFindButton() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLead_MergeLead.findButton.Xpath"));
		Thread.sleep(5000);
		return this;
	}
	
	public FindLead_MergeLeadPage waitForFindResult(){
		webdriverWaitElementTobeClikcable(prop.getProperty("FindLead_MergeLead.SearchResult.Xpath"));
		return this;
	}

	public FindLead_MergeLeadPage clickFirstLeadId(){
		clickByXpath(prop.getProperty("FindLead_MergeLead.firstLeadId.Xpath"));
		return this;
	}

	public MergeLeadPage switchMergeLeadWindow(){
		switchToParentWindow();
		return new MergeLeadPage();
	}







}
