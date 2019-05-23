package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HD {

	WebDriver driver;

	public static void TechFiosElements(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(how = How.ID, using = "username")
	WebElement Email;

	@FindBy(how = How.ID, using = "password")
	WebElement Password;

	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

	@FindBy(xpath = "//span[contains(text(), 'Transactions')]")
	WebElement Transactions;

	@FindBy(xpath = "//a[contains(text(), 'New Deposit')]")
	WebElement NewDeposit;

	@FindBy(xpath = "//option[@value='Masud Ahmed']")
	WebElement SelectOption;

	@FindBy(xpath = "//input[@id='date']")
	WebElement DatePicker;

	public void Login(String email, String password, String datepicker) {
		Email.sendKeys(email);
		Password.sendKeys(password);
		SignInButton.click();
		Transactions.click();
		NewDeposit.click();
		SelectOption.click();
		DatePicker.clear();
		DatePicker.sendKeys(datepicker);
		DatePicker.sendKeys(Keys.TAB);

	}

}
