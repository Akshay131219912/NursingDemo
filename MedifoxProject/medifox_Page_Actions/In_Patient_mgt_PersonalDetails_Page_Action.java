package medifox_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import medifox_Page_Locator.In_Patient_mgt_PersonalDetails_Locator;
import medifox_Page_Locator.Patient_Management_Page_Locator;
import webCommonFunctions.WebElementCommon;

public class In_Patient_mgt_PersonalDetails_Page_Action {
	WebDriver driver = null;
	In_Patient_mgt_PersonalDetails_Locator action = null;
	ExtentTest logger = null;
	public String atrributeValue =null;

	public In_Patient_mgt_PersonalDetails_Page_Action(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		action = new In_Patient_mgt_PersonalDetails_Locator(driver, logger);
	}

	public void getUHID() {
		WebElement element = action.UHIDField();
		boolean flag = WebElementCommon.isClickable(element);
		if (flag==true) {
			atrributeValue = element.getAttribute("value");
			logger.log(LogStatus.PASS, "UHID field value is "+atrributeValue);
		}
	}

	public void enterPersonalDetails() {
		getUHID();
		logger.log(LogStatus.PASS, "UHID is autopopulated with value "+atrributeValue+"");
	}
}
