package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(xpath = "//*[contains(text(),'CRM')]")
	WebElement CRM;

	@FindBy(xpath = "//*[contains(text(),'Add Contact')]")
	WebElement AddContact;

	public void NavigateToAddContact() {
		CRM.click();
		AddContact.click();
	}

}
