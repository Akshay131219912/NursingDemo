package reporterPkg;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasicReporter {
	
	ExtentReports report = null;
	ExtentTest testReports = null;
	
	@BeforeTest
	public void beforeTest() {
		 report=new ExtentReports("E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/Reports/testResult.html",true);
		 testReports=report.startTest("method name");
	}
	@Test
	public void loginTest() {
		testReports.log(LogStatus.PASS, "Navigated to dashboard");
		testReports.log(LogStatus.PASS, "Navigated to inbox");
		
	}
	@Test
	public void inboxTest() {
		testReports.log(LogStatus.FAIL, "Navigated to dashboard");
	}
	@AfterTest
	public void afterMethodTest() {
		report.endTest(testReports);
		report.flush();
	}
	}
