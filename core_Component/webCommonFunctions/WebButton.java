package webCommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebButton {
	public static void click(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		if(WebElementCommon.isClickable(element)) {
			element.click();
		}
	}
	public static void click(WebDriver driver, By by) {
		WebElement button = WebElementCommon.isClickable(driver, by);
		button.click();
	}
	public static void click(WebElement element, String field, ExtentTest logger) {
		Boolean buttonflag = WebElementCommon.isClickable(element);
		if(buttonflag==true) {
			element.click();
			logger.log(LogStatus.PASS, "User succesfully click on "+field+" button");
		}else {
			logger.log(LogStatus.FAIL, "User not able to click on "+field+" button");
		}

	}
}
