package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageElements {

	WebDriver driver;

	public LoginPageElements(WebDriver lDriver) {
		this.driver = lDriver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement Email;

	@FindBy(how = How.ID, using = "password")
	WebElement Password;

	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

	public void Login(String email, String password) {
		Email.sendKeys(email);
		Password.sendKeys(password);
		SignInButton.click();
	}

}
