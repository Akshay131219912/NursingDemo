package webCommonFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
	public static Select select;
	public static void selectDropDownByIndex(WebElement element,int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	public static void selectDropDownByValue(WebElement element,String value) {
		 select = new Select(element);
		select.selectByValue(value);	
	}
	public static void selectDropDownByText(WebElement element,String text) {
		 select = new Select(element);
		select.selectByVisibleText(text);	
	}
	public static void deselectDropDownByIndex(WebElement element,int index) {
		 select = new Select(element);
		select.deselectByIndex(index);
	}
	public static void deselectDropDownByValue(WebElement element,String value) {
		 select = new Select(element);
		select.deselectByValue(value);	
	}
	public static void deselectDropDownByText(WebElement element,String text) {
		 select = new Select(element);
		select.deselectByVisibleText(text);	
	}
	public static void deselectAll(WebElement element) {
		 select = new Select(element);
		select.deselectAll();
	}
}
