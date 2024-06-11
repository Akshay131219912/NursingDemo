package webCommonFunctions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {	
	
	public static Actions action;
	public static void sendsText(WebDriver driver,String locator,String locval,String text) {
		WebElement element=WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.click(element).sendKeys(text).build().perform();
	}
	
	public static void enterKey(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.click(element).sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void selectAlltext(WebDriver driver,String locator,String locval) {
		WebElement element = WebElementCommon.buildElement(driver, locator, locval);
		action=new Actions(driver);
		action.click(element).sendKeys("Text").build().perform();
		action.click(element).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}
}
