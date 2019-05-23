package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContact {

	WebDriver driver;

	public AddContact(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(how = How.ID, using = "account")
	WebElement Fullname;

	@FindBy(how = How.ID, using = "company")
	WebElement Name;

	@FindBy(how = How.ID, using = "email")
	WebElement Email;

	@FindBy(how = How.ID, using = "phone")
	WebElement Phone;

	@FindBy(how = How.ID, using = "address")
	WebElement Address;

	@FindBy(how = How.ID, using = "city")
	WebElement City;

	@FindBy(how = How.ID, using = "state")
	WebElement State;

	@FindBy(how = How.ID, using = "zip")
	WebElement Zip;

	@FindBy(how = How.ID, using = "submit")
	WebElement SubmitButton;

	public void FillingUpAddressForm(String fullname, String cname, String phone, String address, String city,
			String state, String zip, String email) {

		Fullname.sendKeys(fullname);
		Name.sendKeys(cname);
		Email.sendKeys(email);
		Phone.sendKeys(phone);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Zip.sendKeys(zip);
		SubmitButton.click();

	}

}
