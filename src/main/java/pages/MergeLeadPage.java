package pages;

import org.openqa.selenium.Alert;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Lead Page", "FAIL");
	}

	public MergeLeadPage clickFromButton(){
		clickByXpath(prop.getProperty("MergeLead.fromButton.Xpath"));
		return this;
	}

	public MergeLeadPage clickToButton(){
		clickByXpath(prop.getProperty("MergeLead.toButton.Xpath"));
		return this;
	}

	public ViewLeadPage clickMergeButton() {
		clickByXpathWithoutSnap(prop.getProperty("MergeLead.mergeButton.Xpath"));
		acceptAlert();
		return new ViewLeadPage();
	}

	public FindLead_MergeLeadPage switchFindLead_MergeLeadWindow(){
		switchToLastWindow();
		return new FindLead_MergeLeadPage();
	}







}
