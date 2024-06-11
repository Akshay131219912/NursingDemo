package webCommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {
	public static Actions action;
	public static void moveToElement(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public static void dragAndDrop(WebDriver driver,String locator1,String locval1,String locator2,String locval2) {
		WebElement drag = WebElementCommon.buildElement(driver, locator1, locval1);
		WebElement drop = WebElementCommon.buildElement(driver, locator2, locval2);
		action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	public static void contextClick(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.contextClick(element).build().perform();
	}
	public static void clickAndHold(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.clickAndHold(element).build().perform();
	}
	public static void doubleClick(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.doubleClick(element).build().perform();
	}
	public static void click(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.click(element).build().perform();
	}
}
