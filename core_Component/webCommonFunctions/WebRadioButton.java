package webCommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WebRadioButton {
	public static void radioButton(WebDriver driver,String locator,String locval) {
		WebElement element=WebElementCommon.buildElement(driver, locator, locval);
		if(WebElementCommon.isClickable(element)) {
			if(element.isSelected()==false) {
				element.click();	
			}
		}	
	}
}
