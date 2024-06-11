package webCommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void dropDown(WebDriver driver,String by,String val,String locator,String locval) {
		Select select = new Select(WebElementCommon.buildElement(driver, locator, locval));
		switch (by) {
		case "value":
			select.selectByValue(val);
			break;
		case "visibletext":
			select.selectByVisibleText(val);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(val));
			break;
		default:
			break;
		}
	}

}
