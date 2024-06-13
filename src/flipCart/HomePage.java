package flipCart;

import javax.sql.CommonDataSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseConfigurations {

	@Override
	void execute() {
		HomePage page = new HomePage();
		
		page.search();
		common.scrollDown("window.scrollBy(0,500)",DriverConfiguration.getInstance().getDriver());
		page.selectProduct();
		common.singlewindowHandling(DriverConfiguration.getInstance().getDriver());
	}

	public void search() {
		
		WebElement element = common.findElement(HomePageUIElements.serach,DriverConfiguration.getInstance().getDriver());
		common.sendKeys("OnePlus", element);
		WebElement searchelement = common.findElement(HomePageUIElements.searchbtn,DriverConfiguration.getInstance().getDriver());
		common.click(searchelement);
	}
	
	public void selectProduct() {
		WebElement onepluselement=common.findElement(HomePageUIElements.oneplus, DriverConfiguration.getInstance().getDriver());
		common.click(onepluselement);
	}
	public void addToCart() {
		WebElement element = common.findElement(HomePageUIElements.addtocart,DriverConfiguration.getInstance().getDriver());
		common.click(element);
	}
	
	@Override
	void nextPage() {
		closeBrowser();

	}

}
