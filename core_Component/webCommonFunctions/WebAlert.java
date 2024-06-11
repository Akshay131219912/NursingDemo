package webCommonFunctions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
public class WebAlert {
	static Alert alert;
	public static void acceptAlert(WebDriver driver,ExtentTest test) {
		alert=WebElementCommon.checkAlert(driver,test);
		alert.accept();
	}
	public static void dismissAlert(WebDriver driver,ExtentTest test) {
		alert=WebElementCommon.checkAlert(driver,test);
		alert.dismiss();
	}
	public static void enterTextAlert(WebDriver driver,String alerttext,ExtentTest test) {
		alert=WebElementCommon.checkAlert(driver,test);
		alert.sendKeys(alerttext);
	}
}