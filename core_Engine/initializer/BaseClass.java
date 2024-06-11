package initializer;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataSource.PropertyReader;
import webCommonFunctions.WebBrowser;

public class BaseClass {
	public WebDriver driver = null;
	public ExtentReports report = null;
	public ExtentTest testReports = null;
	String path = "E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/TestData/Medifox/configue.properties";
	@BeforeSuite
	public void beforeSuiteStart() {
		report = new ExtentReports(
				"E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/Reports/testResultTest.html",
				true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod) {
		testReports = report.startTest(testMethod.getName());
		driver=WebBrowser.openBrowser(PropertyReader.getPropertyValue(path, "browser"), testReports,
				PropertyReader.getPropertyValue(path, "url"));
	}
	@AfterMethod
	public void afterEachTest(Method testMethod) {
		report.endTest(testReports);
		report.flush();
		driver.quit();
	}
	
	public static String screenCapture(WebDriver driver,String name) {
		TakesScreenshot take = (TakesScreenshot)driver;
		File source = take.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/Screenshot/Medifox/"+name+".png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String errflPath=dest.getAbsolutePath();
		return errflPath;
	}
}
