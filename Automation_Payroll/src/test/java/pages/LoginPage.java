package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "LoginForm[username]")
	WebElement Username;

	@FindBy(name = "LoginForm[password]")
	WebElement Password;

	@FindBy(name = "login-button")
	WebElement Login;

	@FindBy(id = "loginform-rememberme")
	WebElement Checkbox;

	@FindBy(xpath = "//input[@id='loginform-rememberme']")
	WebElement rememberMe;

	@FindBy(xpath = "//a[text()='reset it']")
	WebElement resetLink;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userCredentials(String name, String password) {
		Username.sendKeys(name);
		Password.sendKeys(password);
		Login.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterUsername(String username) {
		Username.sendKeys(username);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public String getUserNameText() {
		return Username.getText();
	}

	public String getPasswordText() {
		return Password.getText();
	}

	public String getRemembermeText() {
		return rememberMe.getText();
	}

	public boolean isLoginPageCheckboxClicked() {
		return Checkbox.isSelected();
	}

	public boolean isElementClickable() {
		return Login.isEnabled();
	}

	public String getResetText() {
		return resetLink.getText();
	}

	public ResetPasswordPage ClickonReset() {
		resetLink.click();
		return new ResetPasswordPage(driver);
	}

	public DashBoardPage clickonLogin() {
		Login.click();
		return new DashBoardPage(driver);
	}

}
