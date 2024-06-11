package reporterPkg;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class ReportManager {
	static ExtentReports report = null;
	static ExtentTest testReports = null;
	public static void basicReportConfigue() {
		 report=new ExtentReports("E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/Reports/testResultTest.html",true);
		 testReports=report.startTest("method name");
	}
}
