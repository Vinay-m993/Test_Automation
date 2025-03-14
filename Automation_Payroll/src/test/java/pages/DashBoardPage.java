package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Company']")
	WebElement company;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getHeaderTitle() {
		return driver.getTitle();
	}

	public CompanyPage clickonCompanyMenu() {
		company.click();
		return new CompanyPage(driver);

	}

}
