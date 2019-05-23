package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.HD;
import Util.BF2;

public class HDTest {

	WebDriver driver;

	@Test
	public void HomeDashBoardTest() {

		WebDriver driver = BF2.callBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
		HD TechFiosElements = PageFactory.initElements(driver, HD.class);
		TechFiosElements.Login("techfiosdemo@gmail.com", "abc123", "2018-12-19");

		// driver.close();
		// driver.quit();
	}

}
