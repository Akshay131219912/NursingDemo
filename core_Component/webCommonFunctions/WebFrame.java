package webCommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFrame {
	public static void webFrameByWebElement(WebDriver driver, String locator, String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		driver.switchTo().frame(element);
	}
	public static void webFrameByName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	public static void webFrameByWebElement(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	public static void webFrameDefault(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
}
