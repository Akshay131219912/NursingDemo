package flipCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseConfigurations {
	
	WebDriverUtils common;

	public BaseConfigurations() {
		
		
		common=new WebDriverUtils();
	}

	abstract void execute();

	
	abstract void nextPage();

	void closeBrowser() {
		
	}

}
