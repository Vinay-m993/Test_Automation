package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DivisionPage {

	WebDriver driver;

	@FindBy(id = "division-company_id")
	WebElement selectCompany;

	@FindBy(id = "division-branch_id")
	WebElement selectBranch;

	@FindBy(id = "division-division_name")
	WebElement divisionName;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement buttonSave;

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clients;

	public DivisionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void selectCompanyId(String companySelect) {
		selectCompany.sendKeys(companySelect);
	}

	public void selectBranchId(String branchSelect) {
		selectBranch.sendKeys(branchSelect);
	}

	public void enterDivisionName(String nameDivision) {
		divisionName.sendKeys(nameDivision);
	}

	public void clickonSaveButton() {
		buttonSave.click();
	}

	public ClientPage clickonClientMenu() {
		clients.click();
		return new ClientPage(driver);
	}

}
