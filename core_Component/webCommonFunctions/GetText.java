package webCommonFunctions;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GetText {
	
	public static String getText(WebElement element, String field, ExtentTest logger) {
		String elementText=null;
		try {
			elementText=element.getText();
			logger.log(LogStatus.PASS, "User is able to retrive text of webElement of "+field);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "User is not able to retrive text of webElement of "+field);
		}
		return elementText;
	}

}
