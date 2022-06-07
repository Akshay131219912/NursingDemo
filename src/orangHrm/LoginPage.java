package orangHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	
	private By username=By.xpath("//input[@id='txtUsername']");
	private By password=By.id("txtPassword");
	private By loginbtn=By.id("btnLogin");
	private By forgotpass=By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	public LoginPage() {
	 this.driver=driver;
	} 

	//WebElement username1=driver.findElement(By.xpath(username));
	public static  void getUsername(String username) {
		driver.findElement(By.xpath(username));
		 
		
	}
	public static void getPassword(String password) {
		driver.findElement(By.xpath(password));
	}
	public static void loginClick(String loginbtn) {
		driver.findElement(By.xpath(loginbtn));
	}
	
	public static String getTiltle() {
		 String title=driver.getTitle();
		 return title;
	}
	
	public  void login() {
		
	
		
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginbtn).click();;
		
	}
	
	
	
	public void forgotPassWord() {
		driver.findElement(forgotpass).click();
	}
	
	public void isElementAvailable() {
		
	}
	

}
