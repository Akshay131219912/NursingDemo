package webCommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebLink {
	public static void webLink(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		if(WebElementCommon.isClickable(element)) {
			element.click();
		}
	}
}
