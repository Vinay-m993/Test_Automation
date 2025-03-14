package testScripts;

import org.testng.Assert;

import pages.CompanyPage;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class CompanyTest extends ExcelDataUtil {

	// @Test
	public void verifyCompanypageTitle() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String Actual = company.getTitle();
		String Expected = "Company";
		Assert.assertEquals(Actual, Expected, "Invalid title");
	}

	// @Test
	public void verifyCompanyRegistration() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		company.enterCompanyname("Obsqura");
		company.enterComnpanyEmailId("obsqura@test.com");
		company.enterCompanyAddress("TVMAddress");
		company.enterDaytoday();
		// company.enterStartedDate("21-11-2020");
		company.clickonStatus();
		company.clickSavebutton();
	}

}
