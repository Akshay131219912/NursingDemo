package flipCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseConfigurations {
	

	public static void main(String args[]) {
		LoginPage login = new LoginPage();
		login.execute();
		login.nextPage();
		
		
	}

	public void execute() {
		amazonloginpage();

	}

	public void amazonloginpage() {
		
		WebElement email = common.findElement(LoginUIElements.username,DriverConfiguration.getInstance().getDriver());
		common.sendKeys("8087087394", email);

		WebElement con = common.findElement(LoginUIElements.ContinueBtn,DriverConfiguration.getInstance().getDriver());
		common.click(con);

		WebElement pass = common.findElement(LoginUIElements.password,DriverConfiguration.getInstance().getDriver());
		common.sendKeys("Komal@123", pass);

		WebElement loginbtn = common.findElement(LoginUIElements.Loginbtn,DriverConfiguration.getInstance().getDriver());
		common.click(loginbtn);

	}

	@Override
	void nextPage() {
		
		HomePage page = new HomePage();
		page.execute();
		
		

	}

}
