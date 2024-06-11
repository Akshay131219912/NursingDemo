package webCommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCheckBox {
	public static void checkBox(WebElement element) {
		if (WebElementCommon.isClickable(element)) {
			if (element.isSelected() == false) {
				element.click();
			} else {
				System.out.println("Checkbox is selected");
			}
		}
	}
	public static void multiSelectCheckBox(WebDriver driver, String locator, String locval, String checkboxName1,
			String checkboxName2, String attributeName) {

		for (WebElement ele : WebElementCommon.buildElements(driver, locator, locval)) {
			if ((ele.getAttribute(attributeName).equals(checkboxName1))
					|| (ele.getAttribute(attributeName).equals(checkboxName2))) {
				ele.click();
			}
		}
	}
}
