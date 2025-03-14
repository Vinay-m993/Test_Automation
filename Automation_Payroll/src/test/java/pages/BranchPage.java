package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchPage {

	WebDriver driver;

	@FindBy(name = "Branch[company_id]")
	WebElement companyId;

	@FindBy(name = "Branch[branch_name]")
	WebElement branchName;

	@FindBy(name = "Branch[branch_address]")
	WebElement branchAddress;

	@FindBy(name = "Branch[status]")
	WebElement status;

	@FindBy(xpath = "//label[text()='Status']")
	WebElement save;

	@FindBy(xpath = "//a[text()='Division']")
	WebElement division;

	public BranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterCompanyname(String CompanyName) {
		companyId.sendKeys(CompanyName);
	}

	public void enterBranchname(String BranchName) {
		branchName.sendKeys(BranchName);
	}

	public void enterBranchaddress(String address) {
		branchAddress.sendKeys(address);
	}

	public void clickonSave() {
		save.click();
	}

	public DivisionPage clickonDivisionsubMenu() {
		division.click();
		return new DivisionPage(driver);
	}

}
