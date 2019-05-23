package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.LoginPageElements;
import Util.BrowserFactory;

public class LoginTest {

	@Test
	public void TechfiosLoginTest() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		LoginPageElements logintotechfios = PageFactory.initElements(driver, LoginPageElements.class);
		logintotechfios.Login("techfiosdemo@gmail.com", "abc123");

		driver.close();
		driver.quit();
	}

}
