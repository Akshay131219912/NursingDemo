package orangHrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTest extends LoginPage  {
	
	
  
public LoginPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
  public void loginPage() {
	login();
  }
@Test(priority = 1)
public void titleTest() {
	Assert.assertEquals(getTiltle(),"OrangeHRM");
	System.out.println(getTiltle());
	}


}
