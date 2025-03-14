package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='company-company_name']")
	WebElement name;

	@FindBy(name = "Company[company_email]")
	WebElement email;

	@FindBy(name = "Company[company_address]")
	WebElement address;

	@FindBy(id = "company-started_at]")
	WebElement startedat;

	@FindBy(xpath = "//td[@class='today day']")
	WebElement dateToday;

	@FindBy(name = "//span[@class='cbx-icon']")
	WebElement status;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement buttonSave;

	@FindBy(xpath = "//a[text()='Branch']")
	WebElement branch;

	public CompanyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterCompanyname(String companyname) {
		name.clear();
		name.sendKeys(companyname);
	}

	public void enterComnpanyEmailId(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}

	public void enterCompanyAddress(String Address) {
		address.clear();
		address.sendKeys(Address);
	}

	public void enterStartedDate(String startDate) {
		startedat.clear();
		// startedat.sendKeys(startDate);

	}

	public void enterDaytoday() {
		startedat.click();
		dateToday.click();
	}

	public void clickonStatus() {
		status.click();
	}

	public void clickSavebutton() {
		buttonSave.click();
	}

	public BranchPage clickonBranchsubMenu() {
		branch.click();
		return new BranchPage(driver);

	}

}
