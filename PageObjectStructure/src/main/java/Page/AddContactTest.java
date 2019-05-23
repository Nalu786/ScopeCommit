package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Util.BrowserFactory;

public class AddContactTest {

	@Test
	@Parameters({ "Loginemail", "password", "Name", "Company", "Phone", "Email", "Address", "City", "State", "Zip" })

	public void AddingContact(String Loginemail, String password, String Name, String Company, String Phone,
			String Email, String Address, String City, String State, String Zip) {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

		LoginPageElements logintotechfios = PageFactory.initElements(driver, LoginPageElements.class);

		logintotechfios.Login(Loginemail, password);

		HomePage home = PageFactory.initElements(driver, HomePage.class);

		home.NavigateToAddContact();

		AddContact contact = PageFactory.initElements(driver, AddContact.class);

		contact.FillingUpAddressForm(Name, Company, Phone, Address, City, State, Zip, Email);

	}
}
