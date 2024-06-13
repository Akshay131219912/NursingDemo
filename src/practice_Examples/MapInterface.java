package practice_Examples;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(Username("Customer"));
		driver.findElement(By.name("password")).sendKeys(Password("Customer"));
		driver.close();
		
	}
	public static HashMap<String, String> MapInterfaace() {
		HashMap <String,String> hm = new HashMap<String,String>();
		hm.put("Customer", "akshay:Akshay@123");
		hm.put("Sales", "amit:Am@123");
		hm.put("RIC", "Sujay:s@123");
		System.out.println(hm.get("Sales"));
		return hm;
	}
	public static String Username(String role) {
		String username=MapInterfaace().get(
				role).split(":")[0];
		
		return  username;
	}
	public static String Password(String role) {
		String password=MapInterfaace().get(role).split(":")[1];
		
		return  password;
	}

}
