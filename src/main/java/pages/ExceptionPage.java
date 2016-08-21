package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ExceptionPage extends OpentapsWrappers{

	public void verifyException(String text){
		verifyTextContainsByXpath_convertLead(prop.getProperty("ExceptionPage.exceptionMessage.Xpath"), text);
	}



}
