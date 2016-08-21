package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ConvertLeadPage extends OpentapsWrappers{

	public ConvertLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Convert Lead Page", "FAIL");
	}	

	public ExceptionPage clickConvert(){
		clickByClassName(prop.getProperty("ConvertLead.convertButton.class"));
		return new ExceptionPage();
	}
}
